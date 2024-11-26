package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class WebDriverProvider {

    private final WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        createDriver();
    }

    private void createDriver() {

        Configuration.browser           = config.getBrowserName();
        Configuration.browserVersion    = config.getBrowserVersion();
        Configuration.browserSize       = config.getBrowserSize();
        Configuration.pageLoadStrategy  = "eager";

        if (config.getRemoteURL() != null) {
            Configuration.remote = config.getRemoteURL().toString();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));

            Configuration.browserCapabilities = capabilities;
        }
    }
}
