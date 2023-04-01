# INFO314-RMIByHand
Greetings!

In this homework assignment, you are going to implement a primitive distributed object system: Client code will be able to execute a procedure (static method) on a remote server and receive the response. This assignment assumes you will write Java.

The basic premise here is that the `Server` class will be the TCP/IP server, opening port 10314 (it's the closest port number I could make out of "INFO314") to accept requests. When it receives one, it will unpack the request,  The `Client` class will connect to it, send a request, wait for a response, and close the socket.

The homework will give you a set of steps to follow to implement the complete assignment; however, you are free to undertake this in any order you choose. Your grade will be determined entirely by the "UnitTest" class code--we will run it via the `run` script, which will launch the Server, then the Client, several times. You are free to look at the code there, but please don't change anything there.

The code you will be writing will be in the `Client` and `Server` classes. Please take note, the methods marked "DO NOT MODIFY" are to be left alone, otherwise you may make any changes you like to those two classes (or use any other classes you wish).

## Homework
Remember that the stages of a remote procedure call are always:

* server opens for business (listening on a port)
* client marshals the call parameters into a wire-friendly format
* client connects to the server
* client sends the marshaled call data
* server receives the marshaled call data
* server unmarshals the call data back into parameters
* server executes the call with the parameters
* if the call succeeds, the server captures the result; if the call fails (throws an exception), the server captures the error (exception) as the result
* server marshals the result into a wire-friendly format
* server sends the marshaled result data
* client receives the marshaled result data
* server unmarshals the result data
* if the call succeeded, the client returns the result to its caller; if the call failed, the client signals the error (throws the exception)

It is strongly suggested you make use of Java Object Serialization for the marshaling/unmarshaling of data into a wire-friendly format. Make sure to look [at the official Java Serialization docs](https://docs.oracle.com/en/java/javase/20/docs/specs/serialization/index.html) if you have questions, however, we will be using Serialization in its most basic form to keep things as simple as possible. You are of course welcome to implement this any way you wish if you'd prefer to not use Serialization.

### Rubric/Stories

* Client can call `add(2,4)` on the Server and receive `6` back (1pt)
* Client can call `divide(1, 0)` on the Server and receive a `ArithmeticException` back (1pt)
* Client can call `echo("Hello!")` on the Server and receive a `"You said Hello!"` back (1pt)
* Client can call all of the above methods without the Server needing to restart or be started up again (1pt) (**NOTE** This means that the Server is capable of handling any of these requests all on the same port.)
* Client gracefully handles the case where the Server is not running when the Client attempts a remote call (1pt) (**NOTE** Here, "gracefully" means that a message that's somewhat user-friendly is displayed, rather than seeing the exception stack trace.)
