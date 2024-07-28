Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week.

Principais Tecnologias
Java 17: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
Spring Boot 3: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
Spring Data JPA: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
OpenAPI (Swagger): Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
Railway: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.
Link do Figma
O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.

Diagrama de Classes (Domínio da API)
mermaid
Copiar código
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }
  
  class Transaction {
    -int id
    -double amount
    -String type
    -Date date
    -Account fromAccount
    -Account toAccount
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
  Account "1" *-- "N" Transaction
Funcionalidades Adicionais
Transações Bancárias
Adicionamos uma nova funcionalidade para gerenciar transações bancárias, permitindo depósitos, retiradas e transferências entre contas.

Classe Transaction: Representa uma transação bancária, contendo informações como ID, valor, tipo (DEPÓSITO, RETIRADA, TRANSFERÊNCIA), data, conta de origem e conta de destino.
UserService: Atualizado para incluir métodos de realização de transações.
UserController: Adicionados novos endpoints para iniciar transações.
Endpoints de Transações
POST /users/transaction: Realiza uma nova transação. Exemplo de corpo da requisição:
json
Copiar código
{
  "amount": 100.0,
  "type": "DEPOSIT",
  "fromAccount": null,
  "toAccount": {
    "number": "123456",
    "agency": "0001",
    "balance": 1000.0,
    "limit": 500.0
  }
}
IMPORTANTE
Este projeto foi construído com um viés totalmente educacional para a DIO. Por isso, disponibilizamos uma versão mais robusta dele no repositório oficial da DIO:

digitalinnovationone/santander-dev-week-2023-api
Lá incluímos todos os endpoints de CRUD, além de aplicar boas práticas (uso de DTOs e refinamento na documentação da OpenAPI). Sendo assim, caso queira um desafio/referência mais completa é só acessar 👊🤩