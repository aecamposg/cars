# CarsBackend
This project was generated with Spring Boot version 2.5.4.

### Configure the application
Create the database and user for the project:

```
mysql -u root -p
CREATE DATABASE temperies_test;
CREATE USER 'temperies_test'@'localhost' identified by 'temperies2021';
GRANT ALL on temperies_test.* to 'temperies_test'@'localhost';
quit
```

### Documentation
When the project is ready, you can visit the following link to view the documentation:
http://localhost:8080/swagger-ui.html