# example-api: #

- interface: Example**Event**

- interface: Example**Service**: describes everything that Lagom needs to know about how to servce and consume the ExampleService


# example-impl: #

- interface Example**Command**: defines all the commands that the ExampleEntity supports
  + final class ExampleCommand1 implements ExampleCommand
  + final class ExampleCommand2 implements ExampleCommand
  + etc.
  
- class Example**Entity** <ExampleCommand, ExampleEvent, ExampleState>: is an event sourced entity. It has a state.  

- interface Example**Event**: defines all the events that the ExampleEntity supports

- class Example**Module**: binds the ExampleService so that it can be served

- class Example**ServiceImpl** implements ExampleService: implementation of the ExampleService

- final class Example**State**: the state for the entity


# example-stream-api #

- interface Example**StreamService**: describes everything that Lagom needs to know about how to service and consume the ExampleStreamService service


# example-stream-impl #

- class Example**StreamModule**: binds the ExampleStreamService so that is can be served

- class Example**StreamRepository**

- class Example**StreamServiceImpl**: implementation of the ExampleStreamService

- class Exampe**StreamSubscriber**: subscribes to the ExampleService event stream
