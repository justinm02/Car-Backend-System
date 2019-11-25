# Car-Backend-System
Collection of a REST-based Vehicles API, pricing microservice, and location service that tracks vehicle inventory using CRUD operations

## Installation
Download the project via github and open the following using an IDE such as IntelliJ: boogle-maps, eureka-2, pricing-service, vehicles-api

## Usage
Run boogle-maps, eureka-2, pricing-service, and vehicles-api using Maven and use a tool like Postman or the localhost on a web browser to compute the following commands:

Create Car (POST) -> http://localhost:8080/cars
```json
{
	"condition": "NEW",
	"details" : {
		"manufacturer": {"code": 100, "name": "Audi"},
		"model": "Outback",
		"body": "Wagen"
	}
}
```

Update Car By Id (PUT) -> http://localhost:8080/cars/{id}
```json
{
	"condition": "OLD",
	"details" : {
		"manufacturer": {"code": 100, "name": "Audi"},
		"model": "Outback",
		"body": "Wagen"
	}
}
```

Find Car By Id (GET) -> http://localhost:8080/cars/{id}

Delete Car By Id (DELETE) -> http://localhost:8080/cars/{id}

Retrieve List of Cars (GET) -> http://localhost:8080/cars






  
  

