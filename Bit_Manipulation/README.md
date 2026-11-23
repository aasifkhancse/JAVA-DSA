Bit Manipulation – DSA with Java

This folder contains Data Structures and Algorithms (DSA) concepts and problems based on Bit Manipulation, implemented using Java.

It covers bitwise operators, binary number operations, bit-level techniques, and commonly asked coding interview problems.

📚 Topics Covered

- Introduction to Bit Manipulation
- Binary Number System
- Bitwise AND ("&")
- Bitwise OR ("|")
- Bitwise XOR ("^")
- Bitwise NOT ("~")
- Left Shift ("<<")
- Right Shift (">>")
- Unsigned Right Shift (">>>")
- Get ith Bit
- Set ith Bit
- Clear ith Bit
- Update ith Bit
- Check Even or Odd Using Bit Manipulation
- Check Whether a Number Is a Power of 2
- Count Set Bits
- Remove the Last Set Bit
- Fast Exponentiation
- Find the Unique Number
- Swap Two Numbers Using XOR

📂 Folder Structure
```
Bit_Manipulation/
│
├── CountBit.java
├── EvenAndOdd.java
├── FastExponentiation.java
├── PowerOfTwo.java
└── README.md
```
💡 Important Properties

Operation| Expression
Check odd or even| "n & 1"
Remove rightmost set bit| "n & (n - 1)"
Check power of 2| "n > 0 && (n & (n - 1)) == 0"
Set ith bit| "n | (1 << i)"
Clear ith bit| "n & ~(1 << i)"
Toggle ith bit| "n ^ (1 << i)"
Get ith bit| "(n >> i) & 1"

🎯 Learning Objectives

- Understand how numbers are represented in binary.
- Learn bitwise operators and their applications.
- Understand how to perform bit-level operations.
- Learn efficient techniques for manipulating individual bits.
- Solve DSA problems using Bit Manipulation.
- Understand time and space complexity.
- Improve problem-solving and logical thinking.
- Practice important Bit Manipulation coding interview questions.
- Develop efficient Java solutions.

💻 Programming Language

- Java

🚀 How to Run

1. Install JDK on your system.
2. Open the terminal in the Bit_Manipulation folder.
3. Compile the Java file:

javac CountBit.java

4. Run the program:

java CountBit

Note: Replace "CountBit" with the class name of the Java file you want to execute.

📈 Goal

To master Bit Manipulation concepts from beginner to advanced level, understand efficient bitwise techniques, strengthen problem-solving skills, and prepare for technical coding interviews.

Keep Learning | Keep Practicing | Keep Coding 🚀
