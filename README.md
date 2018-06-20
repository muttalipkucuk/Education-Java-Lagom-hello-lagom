# example-api: #

- interface: Example**Event**

- interface: Example**Service**: describes everything that Lagom needs to know about how to servce and consume the ExampleService


# example-impl: #

- interface Example**Command**: defines all the commands that the ExampleEntity supports
  + final class ExampleCommand1 implements ExampleCommand
  + final class ExampleCommand2 implements ExampleCommand
  + etc.
  
- class Example**Entity** <ExampleCommand, ExampleEvent, ExampleState>: is an event sourced entity. It has a state.  

- interface Example __Event__: defines all the events that the ExampleEntity supports

- class ExampleModule: binds the ExampleService so that it can be served

- class ExampleServiceImpl implements ExampleService: implementation of the ExampleService

- final class ExampleState: the state for the entity


# example-stream-api #

- interface ExampleStreamService: describes everything that Lagom needs to know about how to service and consume the ExampleStreamService service


# example-stream-impl #

- class ExampleStreamModule: binds the ExampleStreamService so that is can be served

- class ExampleStreamRepository

- class ExampleStreamServiceImpl: implementation of the ExampleStreamService

- class ExampeStreamSubscriber: subscribes to the ExampleService event stream
