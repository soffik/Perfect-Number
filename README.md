# Perfect-Number

### Application
To start the application, you can do one of the following:
* Run in IntelliJ (or other IDE) or
* Run jar file under target folder with: java -jar rest-application-perfect-number-0.0.1-SNAPSHOT.jar


When the application is up an running you can do the following to see if a number is a perfect number:
* Either type in your browser (where 6 can be replaced by other number as well): 
```
http://localhost:8080/isPerfectNumber/6`
```

* Or use curl in terminal window: 
```
curl http://localhost:8080/isPerfectNumber/6
```


To get perfect numbers in a range you can do the following:
* Type in your browser (where 1 and 1000 can be replaced by other numbers): 
```
http://localhost:8080/getPerfectNumbersInRange/1/10000
```

* Use curl in terminal window (for GET): 
```
curl http://localhost:8080/getPerfectNumbersInRange/1/10000
```

* Use curl in terminal window (for POST): 
```
curl -d '{"start":1,"end":10000}' -H 'Content-Type: application/json' http://localhost:8080/getPerfectNumbersInRange
```

