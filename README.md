# a2si-capacity-history-service
The long term storage and retrieval API for Capacity Wait Times  

## To Run the project
To run the project you need a PostgreSQL DB running. Pass the following properties to Spring Boot:
* spring.datasource.url
* spring.datasource.username
* spring.datasource.password

## Example REST Post
```
{
	"service" : {
		"id" : "ABC123",
		"name" : "South Bank Service"
	},
	"waitTimeInMinutes" : 3,
	"updated" : "2018-10-22 15:51",
	"provider" : {
		"name": "Data Provider Service",
		"region" : "South East"
	}
}
```
