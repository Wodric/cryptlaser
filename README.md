# cryptlaser

# Requirement 

- NodeJS (last stable version)
- NPM
- Angular CLI
- Java 8
- Maven
- Git

Dont forgot your JAVA_HOME and MVN_HOME variable

# How to start project in Dev mode

## Get code

 Clone this repository

git clone https://github.com/Wodric/cryptlaser.git

## Start server side

It will start the server on 8080, if there is already some stuff running on this port, Cryptlaser won't start.

- cd cryptlaser-backend
- mvn spring-boot:run

## Start web-side

It will start the web-side on 4200, if there is already some stuff running on this port, Cryptlaser won't start.

- cd ..
- cd cryptlaser-web
- npm install 
- ng serve --open
