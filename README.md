# the-three-nuts

Simple _Hello World_ applications written in three different java frameworks and packed into docker to compare.

- [Open Libery](https://openliberty.io/)
- [Quarkus](https://quarkus.io/)
- [Spring Boot](https://spring.io/projects/spring-boot)

All applications are packed in [openjdk official image](https://hub.docker.com/_/openjdk). 


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


### endpoints

- [open-liberty-nut](http://127.0.0.1:8081/open-liberty-nut/hello)
- [quarkus-nut](http://127.0.0.1:8082/hello)
- [spring-boot-nut](http://127.0.0.1:8081/hello)
 

## measuring


### image size

```shell script
docker image ls
```

```
REPOSITORY                  TAG                 IMAGE ID            CREATED             SIZE
janobono/spring-boot-nut    latest              621dadce01fe        17 seconds ago      120MB
janobono/quarkus-nut        latest              daa88b557232        28 seconds ago      104MB
janobono/open-liberty-nut   latest              4ce1bd5c6372        44 seconds ago      424MB
openjdk                     8-jre-alpine        f7a292bbb70c        7 months ago        84.9MB
```


### memory consumption

```shell script
docker stats
```

```
CONTAINER ID        NAME                                CPU %               MEM USAGE / LIMIT     MEM %               NET I/O             BLOCK I/O           PIDS
765cbfea5230        the-three-nuts_quarcus-nut_1        0.32%               81.23MiB / 7.677GiB   1.03%               5.31kB / 0B         0B / 0B             25
b14e4ce55ee5        the-three-nuts_spring-boot-nut_1    0.32%               175.2MiB / 7.677GiB   2.23%               5.31kB / 0B         0B / 0B             31
c3d537f2c412        the-three-nuts_open-liberty-nut_1   1.53%               255MiB / 7.677GiB     3.24%               5.58kB / 0B         0B / 65.5kB         42
```


## results

1. quarkus
1. springboot
1. open liberty
