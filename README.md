# Getting Started

### Reference Documentation
This service contains two API which will help you to track the weather summary as well as hourly forecast for any desired place.

The API are: 
* Get the Weather forecast summary of Any city using API
* Get hourly Weather forecast details of Any city using API

## Get the Weather forecast summary of Any city using API

* GET Request to /weather/{location} 
* return the JSON Response containing all the information regarding the weather summary for that city.

## Get hourly Weather forecast details of Any city using API

* GET Request to /weather/{location}/hourly
* return the JSON Response containing all the information regarding the weather summary for that city on hourly basis.

## Important points to keep in mind 

* Basic authentication is set in the service so while accessing with browser you will get Login form and while using with Postman use the the Authentication tab to login, otherwise you will get 401 unauthorized Error.
* UserName -> weatherAdmin
* Password -> weatherPassword
* Also as we are using free trail version of Rapid API , there is daily quota of 10 request per user. If that is reached then you will get the error message with Error code 429. In this case you can change the Rapid API key in the application.yaml file in order to continue using the application or else you can wait 24 hours for that quota to be refreshed.



Thank You, I hope you will enjoy using this service.