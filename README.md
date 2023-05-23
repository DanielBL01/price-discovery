# Price Discovery Personal Project

## Learning how to build a complex personal project
- Deploy frequently and push to version control. The more you develop locally, the more complexities you bring when it comes time to deploy. Much better to struggle in increments when facing deployment challenges

## What is Price Discovery?

## Technologies
- Java 17
- Maven
- Docker

## Microservices Architecture
By following a microservices architecture, we can organize our business logic as a collection of *loosely coupled* and independently deployed services.

This usually means then that each service or services can be owned by a small team, however since this is just my own personal project, I'll own all the services.

### Microservices in Price Discovery Project
- data-publisher-microservice
- data-consumer-microservice

### Message Queue
Using a message queue even though we only have a single publisher and subscriber still offers the benefits of:
- Asynchronous communication. The publisher can produce messages and proceed with its own tasks.
- Message persistence. Once the publisher publishes the message and does something else, the message is durable in the message queue to be consumed.
- Loose Coupling. Since we decoupled the publisher and consumer as its own microservice, it offers more flexibility to make changes to the services independently.

### Containerization with Docker for Spring Boot Microservices
- Each Spring Boot project (microservice) has it's own Dockerfile which will copy the jar build.
