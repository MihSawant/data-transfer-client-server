# data-transfer-client-server
This is a simple app which uses one of the data transferring methods in web which is
using Path Variables in the URI.

In this example I have a Controller which binds to method: http://localhost:PORT/books/{name}/{id}, It basically means
that the Client who is accessing the URI has to pass name and id as they are annotated with @PathVariable annotation so 
spring will treat them as Path-Variables and when we pass the data, it goes to the server and using the Model we can pass
that data to our View and display the data.

Transferring data through path-variables is a method but we can only send small amount of data using this variables, Do
not use more than 3 parameters. Yes we can use it so it directly can be appended with the URI and is a easy method and can 
be viewed in the URI and when the value we pass is compulsory to be entered.
