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


## links

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
janobono/spring-boot-nut    latest              b2b9128b0c9b        3 minutes ago       219MB
janobono/quarkus-nut        latest              6c51d1043742        3 minutes ago       203MB
janobono/open-liberty-nut   latest              a7436d2df923        4 minutes ago       523MB
openjdk                     8-jre-slim          bf4f62306d0f        5 weeks ago         184MB
```


### memory consumption

```shell script
docker stats
```

```
CONTAINER ID        NAME                                CPU %               MEM USAGE / LIMIT     MEM %               NET I/O             BLOCK I/O           PIDS
d507358bab40        the-three-nuts_quarcus-nut_1        0.29%               89.53MiB / 7.677GiB   1.14%               5.9kB / 0B          0B / 0B             25
246e0ca525ba        the-three-nuts_spring-boot-nut_1    0.24%               177.4MiB / 7.677GiB   2.26%               5.81kB / 0B         0B / 0B             31
aed30d7399df        the-three-nuts_open-liberty-nut_1   0.99%               306MiB / 7.677GiB     3.89%               5.81kB / 0B         0B / 606kB          45
```


## results

1. quarkus (203MB/89.53MiB)
1. springboot (219MB/177.4MiB)
1. open liberty (523MB/306MiB)
