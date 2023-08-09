# Working With Java Collections

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][4]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][5]

The goal of this programming assignment is to practise working with:
- the [Java Collections Framework][2]
- and learn to distinguish working with interfaces and actual implementations

## :books: Java Collections

Implement all the methods of the [`CollectionsAssignment` class][3]. 
Each method has documentation that describes what it should do.

To verify that your code works as expected, run the `CollectionsAssignmentTest` tests.

In your terminal, ensure that you are in the `collections` homework folder.
Then run the following command in your terminal.

```shell
./mvnw clean test
```

If you are on Windows, run this command instead:

```shell
mvnw.cmd clean test
```

## :pushpin: Java Interfaces

Consider the four core interfaces, `Set`, `List`, `Queue`, and `Map`.

For each of the following four assignments, **specify which of the four core interfaces is best-suited**, and **explain how to use it to implement the assignment**.

1. Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month, an employee will be chosen at random from these records to receive a free toy.

A list would be best-suited for this ues-case. I would specifically use an arrayList as this can be iterated over and thus a random name can be chosen, but it also has no size limit and so new employees can easily be added to the list. Additionally, any employees that leave can be easily removed from the arrayList. 

You implement it by creating an arayList, selecting a name at random via the index and printing that name. 
you can do this by: 
A. generating a random index by using: 
int index = (int) (Math.random() * list.size()); 

B. printing out the random element:
System.out.println("The winner is: " + list.get(index))


2. WTI has decided that each new product will be named after an employee but only first names will be used, and each name will be used only once. Prepare a list of unique first names.

A set is best-suited for this use case because this type of interface does not allow for duplicates. 

We would just create a set of strings and because sets do not allow for duplicates, the set will contain only unique names. 

3. WTI decides that it only wants to use the most popular names for its toys. Count up the number of employees who have each first name.

A map would be best-suited for this use case. 
A. A array list would be used to contain the employee names
B.  We would then create a hashMap of employee names to the count 


4. WTI acquires season tickets for the local lacrosse team, to be shared by employees. Create a waiting list for this popular sport.

A queue would be best-suited for this use case. 
This can be implemented by:
A. creating a linkedlist that is able to implement the queue interface. This is the case because this type of collection uses a first in first out method of removal. 

B. Creating a new queue containing strings of employee names. 

C. Then the poll() function can be used to remove the element in the front of the queue (the winner). 


[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://docs.oracle.com/javase/tutorial/collections/intro/index.html
[3]: https://github.com/cbfacademy/intro-to-java-course/blob/main/homework/collections/src/main/java/com/cbfacademy/CollectionsAssignment.java
[4]: https://junit.org/junit5/
[5]: https://maven.apache.org/