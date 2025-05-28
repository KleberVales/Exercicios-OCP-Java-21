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

#### 1. Check if a number is even or odd

```java
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        String resultado = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número " + numero + " é " + resultado);
    }
}
```

## Making Decisions
## Core APIs
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
