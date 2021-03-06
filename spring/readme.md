# Spring

* Spring
    * IoC
    * Rest API
    * Spring.io



## Spring Core

### Annotations
* Component: Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.
* Repository: Indicates that an annotated class is a "Repository", originally defined by Domain-Driven Design (Evans, 2003) as "a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects".
* Service: Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state."
* Qualifier: This annotation may be used on a field or parameter as a qualifier for candidate beans when autowiring. It may also be used to annotate other custom annotations that can then in turn be used as qualifiers.
* ComponentScan: Configures component scanning directives for use with @Configuration classes. Provides support parallel with Spring XML's <context:component-scan> element.
* SpringBootApplication: Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
* Configuration: Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
* Bean: Indicates that a method produces a bean to be managed by the Spring container.
* Primary: Indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency. If exactly one 'primary' bean exists among the candidates, it will be the autowired value.
* Lazy: Indicates whether a bean is to be lazily initialized.

### Classes
* ApplicationContext: Central interface to provide configuration for an application.
* AnnotationConfigApplicationContext: a ApplicationContext specializations that reads annotations.

## Spring Web

### Annotations
* SpringBootApplication: Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
* ResponseStatus: Marks a method or exception class with the status code and reason that should be returned.
* RequestMapping: Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures.
* GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
* RequestParam: Annotation which indicates that a method parameter should be bound to a web request parameter.
* PathVariable: Annotation which indicates that a method parameter should be bound to a URI template variable.
* PostMapping: Annotation for mapping HTTP POST requests onto specific handler methods.
* RequestBody: Annotation indicating a method parameter should be bound to the body of the web request.
* PutMapping: Annotation for mapping HTTP PUT requests onto specific handler methods.
* DeleteMapping: Annotation for mapping HTTP DELETE requests onto specific handler methods.


## References

* https://medium.com/javarevisited/core-spring-framework-annotations-300493ba85da
* https://zetcode.com/spring/annotationconfigapplicationcontext/
* https://www.baeldung.com/spring-component-annotation