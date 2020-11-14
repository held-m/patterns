Patterns
===============

A collection of design patterns.

__Creational Patterns__:

| Pattern | Description |
|:-------:| ----------- |
| [Abstract Factory](patterns/creational/abstract-factory) | ([Description](patterns/creational/abstract-factory)) ([C++](patterns/creational/abstract-factory/c-plus)) ([C#](patterns/creational/abstract-factory/c-sharp)) ([Golang](patterns/creational/abstract-factory/golang)) ([Java](patterns/creational/abstract-factory/java)) ([JS](patterns/creational/abstract-factory/js)) ([PHP](patterns/creational/abstract-factory/php)) ([Python](patterns/creational/abstract-factory/python)) ([Swift](patterns/creational/abstract-factory/swift))|
| [Builder](patterns/creational/builder) | |
| [Factory Method](patterns/creational/factory-method) |  |
| [Pool](patterns/creational/pool) | |
| [Prototype](patterns/creational/prototype) | |

__Structural Patterns__:

| Pattern | Description |
|:-------:| ----------- |
| [Adapter](patterns/structural/adapter) | adapt one interface to another using a white-list |
| [Bridge](patterns/structural/bridge) | a client-provider middleman to soften interface changes |
| [Composite](patterns/structural/composite) | lets clients treat individual objects and compositions uniformly |
| [Decorator](patterns/structural/decorator) | wrap functionality with other functionality in order to affect outputs |
| [Facade](patterns/structural/facade) | use one class as an API to a number of others |
| [MVC](patterns/structural/mvc) | model<->view<->controller (non-strict relationships) |
| [Proxy](patterns/structural/proxy) | an object funnels operations to something else |

__Behavioral Patterns__:

| Pattern | Description |
|:-------:| ----------- |
| [chain_of_responsibility](patterns/behavioral/chain_of_responsibility.py) | apply a chain of successive handlers to try and process the data |
| [catalog](patterns/behavioral/catalog.py) | general methods will call different specialized methods based on construction parameter |
| [chaining_method](patterns/behavioral/chaining_method.py) | continue callback next object method |
| [command](patterns/behavioral/command.py) | bundle a command and arguments to call later |
| [iterator](patterns/behavioral/iterator.py) | traverse a container and access the container's elements |
| [iterator](patterns/behavioral/iterator_alt.py) (alt. impl.)| traverse a container and access the container's elements |
| [mediator](patterns/behavioral/mediator.py) | an object that knows how to connect other objects and act as a proxy |
| [memento](patterns/behavioral/memento.py) | generate an opaque token that can be used to go back to a previous state |
| [observer](patterns/behavioral/observer.py) | provide a callback for notification of events/changes to data |
| [publish_subscribe](patterns/behavioral/publish_subscribe.py) | a source syndicates events/data to 0+ registered listeners |
| [registry](patterns/behavioral/registry.py) | keep track of all subclasses of a given class |
| [specification](patterns/behavioral/specification.py) |  business rules can be recombined by chaining the business rules together using boolean logic |
| [state](patterns/behavioral/state.py) | logic is organized into a discrete number of potential states and the next state that can be transitioned to |
| [strategy](patterns/behavioral/strategy.py) | selectable operations over the same data |
| [template](patterns/behavioral/template.py) | an object imposes a structure but takes pluggable components |
| [visitor](patterns/behavioral/visitor.py) | invoke a callback for all items of a collection |

__Design for Testability Patterns__:

| Pattern | Description |
|:-------:| ----------- |
| [dependency_injection](patterns/dependency_injection.py) | 3 variants of dependency injection |

__Fundamental Patterns__:

| Pattern | Description |
|:-------:| ----------- |
| [delegation_pattern](patterns/fundamental/delegation_pattern.py) | an object handles a request by delegating to a second object (the delegate) |

__Others__:

| Pattern | Description |
|:-------:| ----------- |
| [blackboard](patterns/other/blackboard.py) | architectural model, assemble different sub-system knowledge to build a solution, AI approach - non gang of four pattern |
| [graph_search](patterns/other/graph_search.py) | graphing algorithms - non gang of four pattern |
| [hsm](patterns/other/hsm/hsm.py) | hierarchical state machine - non gang of four pattern |
