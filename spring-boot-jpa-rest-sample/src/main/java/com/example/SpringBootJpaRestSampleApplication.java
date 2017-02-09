package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Data REST builds on top of Spring MVC. 
 * It creates a collection of Spring MVC controllers, 
 * JSON converters, and other beans needed to provide a RESTful front end. 
 * These components link up to the Spring Data JPA backend. 
 * Using Spring Boot this is all autoconfigured; if you want to investigate how that works, 
 * you could start by looking at the RepositoryRestMvcConfiguration in Spring Data REST.
 * 
 * @author Park SeongMin
 *
 */
@SpringBootApplication
public class SpringBootJpaRestSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaRestSampleApplication.class, args);
	}
}

/*
 * 
 * complex
 * curl -v -X PUT -H "Content-Type: text/uri-list" \
     -d "http://localhost:7070/study-spring-data/teacher/1" \
     http://localhost:7070/study-spring-data/course/123/teacher

 * 
 * 
$ curl http://localhost:8080

$ curl http://localhost:8080/people

$ curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Frodo\",  \"lastName\" : \"Baggins\" }" http://localhost:8080/people
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"aaa\",  \"lastName\" : \"bbb\" }" http://localhost:8080/people

$ curl http://localhost:8080/people

$ curl http://localhost:8080/people/1

$ curl http://localhost:8080/people/search

$ curl http://localhost:8080/people/search/findByLastName?name=Baggins


$ curl -X PUT -H "Content-Type:application/json" -d "{ \"firstName\": \"Bilbo\", \"lastName\": \"Baggins\" }" http://localhost:8080/people/1
$ curl http://localhost:8080/people/1

$ curl -X PATCH -H "Content-Type:application/json" -d "{ \"firstName\": \"Bilbo Jr.\" }" http://localhost:8080/people/1
$ curl http://localhost:8080/people/1

$ curl -X DELETE http://localhost:8080/people/1
$ curl http://localhost:8080/people


// pageable
 * http://localhost:8080/people{?page,size,sort}
 * 
 * curl http://localhost:8080/people?page=2&size=5&sort=desc
 * 
 * curl "http://localhost:8080/people?page=0&size=2"
 * 
 * properties (acs, desc)
 * curl "http://localhost:8080/people?page=0&size=2&sort=firstName,asc"
 * curl "http://localhost:8080/people?page=0&size=2&sort=firstName,desc"
 * curl "http://localhost:8080/people?page=0&size=2&sort=firstName&sort=lastName,asc"
 */

