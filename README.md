Builder Pattern Assignment

Project Description

This project demonstrates the Builder creational design pattern in Java.

The chosen product is a Car. The Builder Pattern is used to construct a car step by step and make the construction process more readable and flexible.

Project Structure

Car - Product
CarBuilder - Builder interface
AbstractCarBuilder - common construction logic
LuxuryCarBuilder - Concrete Builder for luxury cars
EconomyCarBuilder - Concrete Builder for economy cars
CarDirector - controls predefined construction
Main - Client
How to Run

Open the project in IntelliJ IDEA.
Use JDK 17.
Open the Main class.
Run the main() method.
Example

The program creates:

a luxury BMW M5;
an economy Toyota Corolla;
a custom car based on the luxury builder.
Design Pattern

The Builder Pattern separates the construction of a complex object from its representation.

Technologies

Java
JDK 17
IntelliJ IDEA
