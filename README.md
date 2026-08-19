
# The new system is intended to assist financial advisors in managing their customers’ portfolios and will significantly improve the existing solution
 The system will help manage multiple financial advisors’ clients.
Financial advisors must be able to create, update, and remove clients.
Each financial advisor can have numerous clients.
Financial advisors will be using the system during standard business hours from 9 to 5 on weekdays.
Each client will have a portfolio.
Client portfolios may contain zero or more securities.
Financial advisors must be able to create, update, and remove securities from client portfolios.
Every security has a name, a category, a purchase date, a purchase price, and a quantity.
The system must have 99% uptime.
The system must expose a React dashboard.
The system’s backend must use the Spring framework for Java.
The system must store data in a relational database.
The system must be highly scalable.
 # First Schema 
<img width="3768" height="1061" alt="image" src="https://github.com/user-attachments/assets/65c90856-bd7f-4e90-879c-de1503ea8964" />


# Second Schema 
 <img width="1742" height="172" alt="1444 drawio" src="https://github.com/user-attachments/assets/7212b1f5-44a4-4235-b133-a19ceefe372d" /> 

 # Implementation :
    Java Persistence API, or JPA for short. The JPA is an object-relational mapping tool (ORM tool) - a means to bridge the gap between Java objects and data held in a relational database. The idea is that each Java object registered with the JPA has a representation of its state persisted to an external database. As you modify the Java object, the corresponding data object is updated as well. As such, when an application closes, all of its data is already saved to the database. The JPA lets us reason about transactions using java objects rather than raw data, and handles the conversion for us behind the scenes.

Fortunately, Spring comes with thorough support for the JPA, and actually allows for multiple database backends. Setting up a project to use Spring with the JPA is relatively straightforward, but you don’t have to worry about it.
