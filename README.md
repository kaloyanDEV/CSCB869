# eregistry (CSCB869)

## Dependencies

jdk 1.8, maven, nodejs, docker, docker-compose

## Development

Start a postgresql database in a docker container:

    docker-compose -f src/main/docker/postgresql.yml up -d

To start project with dev profile:

    mvn spring-boot:run -Dspring-boot.run.profiles=dev

To start front end:

    npm start

Go to http://localhost:9000 > entities > company

To stop container, run:

    docker-compose -f src/main/docker/postgresql.yml down
