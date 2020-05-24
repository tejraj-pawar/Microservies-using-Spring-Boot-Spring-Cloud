# Microservies-using-Spring-Cloud
In this i have created a simple Microservices Architecture with features such as Client Side Load Balancing, Service Discovery, Distributed Error Tracing, Monitoring, Centralized Configuration, Distributed Messaging, Fault Tolerance using Spring Boot, Spring Cloud and Netflix's OSS components.

#### Here, i have uploaded six Maven Projects, Three Microservices, Eureka Naming Server, Zuul API Gateway and Spring Cloud Config Server.

- #### Microservices:
  - **currency-conversion-service**: It is a microservice which is dependent on currency-exchange-service microservice.
  - currency-exchange-service: It is another microservice on which above service is depends.
  - limit-service: It is a microservice whose configuration is stored on Spring Cloud Config Server.

- #### Service Registry:
  - netflix-eureka-naming-server: It is used for service registry and service discovery.
  
- #### API Gateway:
  - netflix-zuul-api-gateway-server: Zuul is a library developed by Netflix that provides dynamic routing, monitoring, resiliency, security, and more amazing features. Our all requests will through this API Gateway.

- #### Spring Cloud Config Server:
  - spring-cloud-config-server: This is responsible for centralised configuration of all microservices.
 
- #### Other Components:
  - Client Side Load Balancing: For this we are using Netflix's Ribbon Load Balancer with Eureka Naming server for service Discovery.
  - Distributed Error Tracing: For this we are using Zipkin UI with Spring Sleuth and RabbitMQ. 
  - Distributed Messaging: For this we are using Spring Cloud Bus.
  - Fault Tolerance: Using Hystrix i'm doing static fault tolerance.
