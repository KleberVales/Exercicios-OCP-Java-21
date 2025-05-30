# Exercicios-OCP-Java-21

## Building Blocks

### Writing a main() Method

#### 1. Simple main method
Modify the program to print each argument passed on the command line, one per line.
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Meu primeiro programa Java!");
    }
}
```
#### 2. Sum of arguments
Complete the program to sum all the numeric arguments passed.
```java
public class SomaArgs {
    public static void main(String[] args) {
        // Implemente a soma dos argumentos passados
        // Dica: use Integer.parseInt() para converter String para int
    }
}
```
#### 3. Method with varargs
```java
public class VarargsExample {
    public static void printAll(String... values) {
        // Implement this method to print all values
    }
    
    public static void main(String[] args) {
        printAll("A", "B", "C");
        printAll("Java", "Python", "C++", "JavaScript");
    }
}
```

## Operators

### Making Decisions with the Ternary Operator

#### 1. Positive/Negative Number Check

* Complete the code using a ternary operator so that it prints "positive" or "negative" depending on the value of the number variable.
```java
public class PositiveNegative {
    public static void main(String[] args) {
        int number = 10; // Change this value to test
        
        // Use ternary operator to determine whether it is positive or negative
        String result = /* your code here */;
        
        System.out.println("O number " + number + " is " + result);
    }
}
```
#### 1. Conditional discount

* Use a ternary operator to calculate the final price with a different discount for premium customers
```java
public class DiscountProduct {
    public static void main(String[] args) {
        double preco = 150.0;
        boolean PremiumClient = true; // Change to false to test
        
        // Apply 20% discount if you are a premium customer, 5% otherwise
        double finalprice = /* your code here */;
        
        System.out.printf("Original price: R$%.2f%n", preco);
        System.out.printf("Final price: R$%.2f%n", finalprice);
    }
}
```

#### 3. Grade classification
* Implement a series of nested ternary operators to provide appropriate grading based on the student's grade
```java
public class StudentClassification {
    public static void main(String[] args) {
        double note = 7.5; // Change this value to test
        
        // Use nested ternary operators to sort:
        // >= 9 → "Excellent"
        // >= 7 → "Good"
        // >= 5 → "Regular"
        // < 5 → "Insufficient"
        String classification = /* your code here */;
        
        System.out.println("Note: " + note + " - " + classification);
    }
}
```

## Making Decisions
## Core APIs

### Creating and Manipulating Strings

#### 1. String Concatention and Length

* Complete the code to concatenate the strings and calculate the length of the full name

```java
public class StringBasic {
    public static void main(String[] args) {
        String fistname = "João";
        String lastname = "Silva";
        
        // 1. Concatenate firstName and lastName with a space between them
        String fullName = /* your code here */;
        
        // 2. Calculate the total length of the full name (including spaces)
        int sizeName = /* your code here */;
        
        System.out.println("Full name: " + fullName);
        System.out.println("Name size: " + sizeName + " characters");
    }
}
```

#### 2. String Manipulation (Casting, Lowercase, and Substitution)

* Implement the requested string manipulation operations

```java
public class StringManipulation {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language!";
        
        // 1. Convert all text to uppercase
        String uppercase = /* your code here */;
        
        // 2. Replace all vowels 'a' with '4'
        String substituted = /* your code here */;
        
        // 3. Extract the word "language" from the original text
        String wordExtracted = /* your code here */;
        
        System.out.println("Original: " + text);
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Substituted: " + substituted);
        System.out.println("Word Extracted: " + wordExtracted);
    }
}
```

3. String Comparison and Analysis

* Implement the requested checks for password string parsing

```java
public class AnalyzeString {
    public static void main(String[] args) {
        String password = "SeguraSegura123";
        String attempt = "segurasenha123";

        // 1. Check if the strings are equal (case sensitive)
        boolean equalCaseSensitive = /* your code here */;

        // 2. Check if they are equal ignoring upper/lower case
        boolean equalIgnoreCase = /* your code here */;

        // 3. Check if the password has at least 8 characters
        boolean tamanhoMinimo = /* your code here */;

        // 4. Check if the password contains at least one number
        boolean containsNumber = /* your code here */;

        System.out.println("Equal (case sensitive): " + equalCaseSensitive); System.out.println("Equals (ignore case): " + equalsIgnoreCase);
        System.out.println("Has minimum size: " + minimumsize);
        System.out.println("Contains number: " + containsNumber);
    }
}
```

## Methods
## Class Design
## Beyond Classes
## Lambdas and Functional Interfaces
## Collections and Generics
## Streams
## Exceptions and Localization
## Modules
## Concurrency
## I/O
