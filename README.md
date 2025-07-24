**23 Gang of Four (GoF) Design Patterns**

---

## 🏗️ **Creational Patterns**

| Pattern              | Intent                                                                 | Example Use Case                        |
| -------------------- | ---------------------------------------------------------------------- | --------------------------------------- |
| **Singleton**        | Ensure a class has only one instance and provide a global access point | Logger, DB Connection Pool              |
| **Factory Method**   | Delegate instantiation to subclasses                                   | Notification service (Email/SMS)        |
| **Abstract Factory** | Create families of related objects without specifying concrete classes | GUI toolkits (Windows/Mac themes)       |
| **Builder**          | Construct complex objects step by step                                 | Building a `House`, `Pizza`, `Computer` |
| **Prototype**        | Clone existing object instead of creating from scratch                 | Object cloning, game characters         |

---

## 🧱 **Structural Patterns**

| Pattern       | Intent                                            | Example Use Case                         |
| ------------- | ------------------------------------------------- | ---------------------------------------- |
| **Adapter**   | Convert one interface into another                | Legacy code integration, plug converters |
| **Bridge**    | Separate abstraction from implementation          | Remote + Device, Shape + Renderer        |
| **Composite** | Treat individual and group of objects uniformly   | File system (Folder/File), UI trees      |
| **Decorator** | Add responsibilities dynamically at runtime       | Adding scrollbars to a window            |
| **Facade**    | Provide simplified interface to complex subsystem | Spring Facades, Home Theater system      |
| **Flyweight** | Share common data to reduce memory usage          | Font caching, game objects               |
| **Proxy**     | Provide a placeholder or surrogate                | Lazy loading, access control, logging    |

---

## 🤝 **Behavioral Patterns**

| Pattern                     | Intent                                                                | Example Use Case                       |
| --------------------------- | --------------------------------------------------------------------- | -------------------------------------- |
| **Observer**                | Notify dependent objects automatically when subject changes           | Event listeners, UI updates            |
| **Strategy**                | Encapsulate interchangeable algorithms                                | Payment methods, Sorting strategies    |
| **Command**                 | Encapsulate a request as an object                                    | Undo/Redo, Remote control              |
| **Chain of Responsibility** | Pass request along a chain of handlers                                | Logging chains, Authentication filters |
| **State**                   | Allow object to change behavior based on internal state               | Vending machine, Media player          |
| **Template Method**         | Define skeleton of algorithm, let subclasses override steps           | Game loop, Report generation           |
| **Mediator**                | Reduce direct communication between objects                           | Chatroom, UI Components interaction    |
| **Iterator**                | Access elements of a collection sequentially without exposing details | Java `Iterator`, custom collections    |
| **Memento**                 | Capture and restore object state without violating encapsulation      | Save/Restore functionality             |
| **Interpreter**             | Define a grammar and interpret sentences in the language              | Expression evaluators, SQL engines     |
| **Visitor**                 | Separate new operations from object structure                         | Code analysis tools, XML parsing       |

---


