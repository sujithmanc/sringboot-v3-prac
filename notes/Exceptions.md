org.springframework.web.reactive.resource.NoResourceFoundException


#1
Name for argument of type [int] not specified, and parameter name information not available via reflection. Ensure that the compiler uses the '-parameters' flag.

When using @PathVariable with primitive types like int, Spring MVC doesn't automatically generate a parameter name from the path variable. This can lead to issues in logging, error messages, and debugging.

```java
@GetExchange("/{id}")
Mono<User> getUserById(@PathVariable int id);
```

Solution:

```java
@GetMapping("/{id}")
public Mono<User> getUserById(@PathVariable("id") int userId) {
    // ...
}
```

# 2
org.springframework.web.reactive.function.client.WebClientResponseException$NotFound: 404 Not Found from
- When resource not found from the client

# 3
org.springframework.beans.factory.UnsatisfiedDependencyException

APPLICATION FAILED TO START

Description:

Parameter 0 of method userProxyClient in com.sujix.sbfeatures.config.ProxyFactoryConfig required a bean of type 'org.springframework.web.reactive.function.client.WebClient' that could not be found.

The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Autowired(required=true)

The following candidates were found but could not be injected:
	- User-defined bean method 'user2Clinet' in 'MyWebClientConfig'
	- User-defined bean method 'postClinet' in 'MyWebClientConfig'
	- User-defined bean method 'todosClient' in 'MyWebClientConfig'
	- User-defined bean method 'cartsClient' in 'MyWebClientConfig'
	- User-defined bean method 'userClient' in 'WebClientConfig'

Action:
Consider revisiting the entries above or defining a bean of type 'org.springframework.web.reactive.function.client.WebClient' in your configuration.

# 4
# 5
# 6
# 7
# 8
# 9
# 10
# 11
# 12
# 13
# 14
# 15
# 16
# 17
# 18
