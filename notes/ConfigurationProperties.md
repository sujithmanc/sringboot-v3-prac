
## Configuration Properties

Getting properties from the YML or PROPERTIES file.

Two ways.
1. Using value annotation on field level
2. Using Configuration Properties on class level

2.1 


@ConfigurationPropertiesScan
@ConfigurationProperties(prefix = "employee")

2.2

@ConfigurationProperties(prefix = "employee")
@SpringBootConfiguration

