### Запуск тестов

> [!IMPORTANT]
> **Локальный запуск** (параметр `-Denv=local` является *не* обязательным)
> ```
> ./gradle clean test -Denv=local
> ```

> [!IMPORTANT]
> **Удаленный запуск на Selenoid** (параметр `-Denv=remote` является *обязательным*)
> ```
> ./gradle clean test -Denv=remote
> ```

> [!IMPORTANT]
> **Удаленный запуск на Selenoid** (параметр `-Denv=prod` является *обязательным*)
> ```
> ./gradle clean test -Denv=prod
> ```
