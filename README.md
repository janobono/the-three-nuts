# the-three-nuts

Simple _Hello World_ applications written in three different java frameworks and packed into docker to compare.

## build

- jdk 1.8
- maven
- docker

```shell script
mvn clean install -Pdocker
```

## run

In root directory

```shell script
docker-compose up
```

## links

- [open-liberty-nut](http://127.0.0.1:8081/open-liberty-nut/hello)
- [quarkus-nut](http://127.0.0.1:8082/hello)
- [spring-boot-nut](http://127.0.0.1:8081/hello)
 
