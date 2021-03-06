# bunny-back

# Getting Started with Bunny back

## Available Scripts

Prerequisites: java14, maven >3.3.x

In order to run this project:

```sh

# database credentials can be configured in a unix base OS

export MONGO_DATABASE=bunny-studio

export MONGO_PASSWORD=bunnypass


# or in windows with powershell terminal

$env:MONGO_DATABASE=bunny-studio

$env:MONGO_PASSWORD=bunnypass

```

-   set directory (cd) to the desired project. ie: `cd users`, or `cd tasks`

### `mvn clean compile install`

This dummy project is not configured with specific profiles for maven neither aditional params.

&nbsp;

### `mvn spring-boot:run`

The `users` project will run on port 9091
The `tasks` project will run on port 9092
Services are configured to accept cors request from `localhost:3000`,
in case that you need to accept another one, please add it to MvcConfig class

To test the project:

### `mvn test`

This is a live server, so it only works locally in the (tomcat) embedded server within maven

&nbsp;

## Database

If you want to connect to DB, then the URI link for mongodb shared cluster is:

```sh

mongodb+srv://${MONGO_USERNAME}:${MONGO_PASSWORD}@mongoameliecluster.bx74j.azure.mongodb.net/bunny-studio?retryWrites=true&w=majority

```

Given user and pass of database will be deprecated on Nov 12th 2020, that credentials are only for testing purposes

<br/>
Architecture Diagram:

`https://docs.google.com/drawings/d/1xxvQUIGfiwKBu6kSgelzFkBp_RLwzaohCYFYMdlDSdY/edit?usp=sharing`
