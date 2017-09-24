## Welcome 
Hi! We are happy to see you here!  
We also have a task for you and hope you'll enjoy it :) 

## Introduction
Your team is working on a big and valuable project having lots of micro services   
You are asked to create a service managing temporary passwords for users:  
generating and verifying passwords, viewing business operations statistics 

The service contract is already defined, moreover, there is a project with service base  
and it already has REST API exposed, basic tests, custom configuration, logging, etc.

## API to implement
Detailed API contract may be found in project sources, these are just brief descriptions of the methods you'll be implementing 

##### 1. Create password
Create a password for a given user with specified timeout (determining password validity period)  
Example: 
      
    GET http://localhost:8080/password/create?user=John&timeout=10
Notes: 
- Timeout is measured in seconds
- If the user already has a valid password, then override it with new one
         
##### 2. Verify password
Check if password for given user exists and is still valid  
Example:
  
    GET http://localhost:8080/password/verify?user=John&pass=xxx

##### 3. Display all operations counts
Display all operations count (password creations, passed/failed verifications) for all the time the service is up   
Example:
  
    GET http://localhost:8080/statistics/operationsCount

##### 4. Display last verifications attempts 
Display info about last N verifications attempts (time, user, result)   
Example:
  
    GET http://localhost:8080/statistics/verificationsLog?count=100
Notes:
- Maximum size of verification attempts to be stored is defined with **history_size** parameter in **tpass.yml** configuration file

## Build, launch, test
The project targets Java 8 and uses Maven for building  
We are using [Dropwizard.io](http://www.dropwizard.io/) as a base framework for our service  
Entry point for the application is **TPassApplication.java**   
There are also some basic tests available in **TPassApplicationTest.java**  

## Recommendations
- We tried to make this task to be looking similar to ones we all have in our real-life work,   
so please feel free to do it the way you are used to 
- We want you to keep API contract the same, all the rest is up to you
- You are free to refactor existing code, add extra libraries to project and so on
- It's OK to have everything in-memory - we don't need any data to be stored externally
- This task is not about security :) and for this particular case it's OK to transfer plain passwords through HTTP 
- Please pay attention to such things like:
  - Performance, pick up suitable efficiently working data structures    
  - Prevent memory leaks at standard and extreme conditions or incorrect input 
  - Maintainability. Try to design and write your implementation so that you and others would like to work with it in future
- We appreciate your time investment and wish you Good Luck!     
