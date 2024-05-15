# Singly Linked List Implementation
A Java implementation of a singly linked list data structure for elements of type char.
## Table of Contents

- [Introduction](#introduction)
- [Node Class](#node-class)
- [Constructor](#constructor)
- [Methods](#methods)
    - [insertHead](#inserthead)
    - [deleteHead](#deletehead)
    - [reverse](#reverse)
    - [deleteByValue](#deletebyvalue)
    - [toString](#tostring)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Introduction
The SinglyLinkedList class provides a simple implementation of a singly linked list data structure for characters. It supports basic operations such as insertion, deletion, reversal, and retrieval.
## Node Class
The Node class represents individual nodes in the linked list. Each node contains a character data value and a reference to the next node in the list.
## Constructor
The constructor initializes the head pointer to null.
## Methods
### insertHead
Inserts a new element at the beginning of the list.

#### deleteHead
Removes the head element of the list.

#### reverse
Reverses the linked list.

#### deleteByValue
Deletes a list element based on the given value.

#### toString
Returns a string representation of the list.

## Usage
```java
import com.da.datastructures.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the SinglyLinkedList class
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert elements into the list
        list.insertHead('A');
        list.insertHead('B');
        list.insertHead('C');

        // Print the list
        System.out.println("List: " + list);

        // Reverse the list
        list.reverse();

        // Print the reversed list
        System.out.println("Reversed List: " + list);
    }
}
```

## Contributing
Contributions are welcome! If you find any bugs or have suggestions for improvements, please open an issue or create a pull request on the GitHub repository.
## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
## Exercises

- [Exercise1](exercise1.md)
- [Exercise2](exercise2.md)
- [Exercise3](exercise3.md)
- [Exercise4](exercise4.md)
- [Exercise5](exercise5.md)
- [Exercise6](exercise6.md)

## Author Information

- **Author:** [Paria Nikparsa](https://github.com/Nikparsa/msd23_Nikparsa_Paria)
- **University:** [FH Joanneum](https://www.fh-joanneum.at/studium/standorte/kapfenberg/)
- **Course of study:** MSD









