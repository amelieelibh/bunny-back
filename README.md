# bunny-back

# Getting Started with Bunny back

## Available Scripts

Prerequisites: java14, maven >3.3.x

In order to run this project:

```sh

export MONGO_DATABASE=bunny-studio

export MONGO_PASSWORD=bunnypass

```

-   set directory (cd) to the desired project. ie: users, or tasks

### `mvn clean compile install`

### `mvn spring-boot:run`

The users project will run on port 9091
The tasks project will run on port 9092
Services are configured to accept cors request from `localhost:3000`,
in case that you need to accepto another one, please add it to MvcConfig class

To test the project:

### `mvn test`

This is a live server, so it only works locally in the (tomcat) embedded server within maven

If you want to connect to DB, then the URI link for mongodb shared server is:

### `mongodb+srv://${MONGO_USERNAME}:${MONGO_PASSWORD}@mongoameliecluster.bx74j.azure.mongodb.net/bunny-studio?retryWrites=true&w=majority`

Given user and pass of database will be deprecated on Nov 12th 2020, that credentials are only for testing purposes
