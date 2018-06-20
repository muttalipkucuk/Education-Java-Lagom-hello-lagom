example-api:

- interface: ExampleEvent

- interface: ExampleService: describes everything that Lagom needs to know about how to servce and consume the ExampleService


example-impl:

- interface ExampleCommand: defines all the commands that the ExampleEntity supports
  + final class ExampleCommand1 implements ExampleCommand
  + final class ExampleCommand2 implements ExampleCommand
  + etc.
  
- class ExampleEntit <ExampleCommand, ExampleEvent, ExampleState>: is an event sourced entity. It has a state.  

- interface ExampleEvent: defines all the events that the ExampleEntity supports

- class ExampleModule: binds the ExampleService so that it can be served

- class ExampleServiceImpl implements ExampleService: implementation of the ExampleService

- final class ExampleState: the state for the entity
