# README #

This is my first kotlin project

### What is this project? ###

* Kotlin with SpringBoot Project. Simple project for beginers
* The concept I used is KNVB club list. I have written for AJAX & PSV Enindhoven.
* I used dynamic autowiring to fetch corresponding services

## Tech Stack

| Technology    | Version       |
| ------------- | :-----------: |
| Java 		    | OpenJDK 11    |
| Kotlin 		| 1.3.72	    |
| SpringBoot    | 2.3.1.BUILD-SNAPSHOT    |

### APIs Used ###
* Java Rest API Controller		-	Just prints "Hello Java World"		-	http://localhost:8080/javacontroller
* Kotlin Rest API Controller	-	Just prints "Hello Kotlin World"	-	http://localhost:8080/kotlincontroller


### API Calls & Output ###
```
curl http://localhost:8080/javacontroller
Hello Java World!
```

```
curl http://localhost:8080/kotlincontroller
Hello Kotlin World!
```

```
curl http://localhost:8080/kotlincontroller/clubs
{Amsterdam=Welcome to Amsterdam football club. Our home ground is AJAX Bijlmer. We are true selected for UEFA Champions league this year. Our KNVB Positon is 1, Eindhoven=Welcome to Eindhoven football club. Our home ground is Philips Stadion Eindhoven. We are false selected for UEFA Champions league this year. Our KNVB Positon is 3}
```

```
curl http://localhost:8080/kotlincontroller/clubs/Amsterdam
{"timestamp":"2020-05-24T00:25:45.808+00:00","status":500,"error":"Internal Server Error","message":"","path":"/kotlincontroller/clubs/Amsterdam"}
```

```
curl http://localhost:8080/kotlincontroller/clubs/Eindhoven
Welcome to Eindhoven football club. Our home ground is Philips Stadion Eindhoven. We are false selected for UEFA Champions league this year. Our KNVB Positon is 3
```

```
curl http://localhost:8080/kotlincontroller/clubs/Amsterdam/captain/H
false
```

```
curl http://localhost:8080/kotlincontroller/clubs/Amsterdam/captain/Hakim%20Ziyech
true
```