# Api Dev Week 2025
API Restful

# Diagrama de Classes

```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }

    class Account {
        -String accountNumber
        -String accountAgency
        -BigDecimal accountBalance
        -BigDecimal accountLimit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -double limit
    }

    class News {
        -String icon
        -String description
    }

    User "1" *-- "1" Account : has
    User "1" *-- "1" Card : has
    User "1" *-- "N" Feature : has many
    User "1" *-- "N" News : has many
```
