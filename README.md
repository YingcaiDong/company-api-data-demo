# Company-api-data-demo
Java backend (spring application connected with MySQL Database) provides a RESTful web service.

# Setup the MySQL sample
Open the terminal, and then type in mysql
>\>mysql source /file_dir/sqlsample.sql

# Packaging a jar file
If you haven't install maven, don't worry, in your terminal
> $ brew install maven

If you already installed maven, you can jump to the following steps:
In the terinal, dirct to the project directory
> $ mvn clean install
Then you can find your jar file within the target directory.

# Running the spring boot app
In your terminal, within the same project directory
> $ java -jar target/yourjarfile.jar

# Test the APIs using Postman
Postman is a free app available on Chrome web store.
The APIs this project provides are:

Access all employees (GET)
> http://localhost:8080/employees/

Access employee using id (GET)
> http://localhost:8080/employees/{id}

Add an employee (POST using JSON)
> http://localhost:8080/employees

Update an employee (PUT using JSON)
> http://localhost:8080/employees/{id}

Delete an employee (DELETE)
> http://localhost:8080/employees/{id}
