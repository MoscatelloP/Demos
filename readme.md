# DEMOS

1. [About this project](#about)
2. [How to run](#how-to-run)
3. [Concepts](#concepts)
   1. [Domain Driven Design](#ddd)

## About this project <a name="about"></a>

This project has no defined purpose. I use it as a general demonstrator and learning tool for various programming concepts, architecture, clean code, framework and libraries...etc

## How to run <a name="how-to-run"></a>

## Concepts <a name="concepts"></a>

### Domain Driven Design <a name="ddd"></a>

This project is organized following the principles of domain driven design (DDD). The code containing the buisness logic, 
otherwise called "the stuff that has value", is isolated from any technical components such as frameworks and libraries. 
Its main objective is to facilitate any technical evolution, framework or database migration that might occur in the future.
Particullary useful for long term projects.<br>

To achieve this, I divided the project in modules :<br>
- Core : This is where the DI framework(s) will be configured and implemented. This module will be responsible for running the application.
- Services : the buisness logic module. Importing libraries (expect for tests) is prevented by the maven enforcer plugin
- Repository : the DAO layer. Implements the SPI interfaces of the service module
- Controller : A Web API layer. Use the API interfaces provided by the service layer