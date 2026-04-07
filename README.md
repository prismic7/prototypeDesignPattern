# prototypeDesignPattern

# Animal Prototype System

This project implements the **Prototype Design Pattern** to manage and duplicate animal objects. It allows for the creation of "Normal" base animals and specialized "Clones" with modified attributes without re-instantiating the entire object from scratch.

## Components
* **Animal.java**: The prototype interface extending `Cloneable`.
* **Sheep, Cow, Horse**: Concrete classes that implement cloning and specific behaviors.
* **AnimalRegistry**: Manages the "master" prototypes and handles the cloning/modification logic.
* **TestAnimal**: The entry point to demonstrate the difference between normal and cloned outputs.

## Expected Output
```text
Outputs:
Cow: Moo
Sheep: Dolly
Horse: Brown
--------------------
Clone Output:
Cow: Moo
Sheep: Shaun
Horse: Black
```
Uml Diagram:
<img width="754" height="357" alt="image" src="https://github.com/user-attachments/assets/7918bca9-478e-444e-a377-6cc35471c64a" />
