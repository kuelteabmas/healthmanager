# Health-Manager Microservices

## Run
Run whole application stack with `docker-compose.yml`

## Packaging
Will build and package into jar and push to Docker Hub

`mvn package -P build-docker-image`

## APIs
Each APIs has `application.yml` for running application with `mvn` and `application-docker.yml` for Docker related application values.

* ### Meal Tracker
  * Tracks all meals

* ### Water Intake Tracker
  * Track all amount of water taken in
  * Amount of times

* ### Bowel Movement Tracker

* ### Health Summary
  * Provides an endpoint to view summary of all health data

## Tools

### Eureka Server - Service Registration and Service Discovery

* act as a **Centralized Service Registry** to automatically register the services and **Client Registration**
* act as a **Load Balancer** among the service instances
* perform **Health Checks** on registered services, ensuring robustness and reliability

### Eureka Clients - API Gateway
 All APIs are declared within `appication.yml` as Eureka Clients that the Eureka Server will manage

### Zipkin - Distributed Tracing 
**Zipkin** for **Distributed Tracing** 

It helps gather timing data needed to troubleshoot latency problems in service architectures. Features include both the collection and lookup of this data.


## Communication
### via Feign Clients 
Clients package
APIs currently communicated by making HTTP calls to each other  

### via Messaging
**RabbitMQ** 

## Database
Persistence: **PostgreSQL**

Dashboard & UI: **PGAdmin**

## Infrastructure
Docker for containerization
Maven and Jib for packaging

## CI/CD
TBD

## Common Utilities 
**TDSCommons** repo for common utility methods between APIs such as:
* Create a database for API if it doesn't exist: `createDbIfNotExists()` 
