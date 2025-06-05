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

#### 1. Filtragem e Contagem com Streams

* Complete usando filter() e count() para obter os resultados

```java
import java.util.List;

public class FiltroStream {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // 1. Filtrar apenas números pares
        long quantidadePares = /* seu código aqui */;
        
        // 2. Filtrar números maiores que 5
        long maioresQueCinco = /* seu código aqui */;
        
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade > 5: " + maioresQueCinco);
    }
}
```

#### 2. Transformação e Redução com Streams

* Implemente usando map(), filter(), reduce() e collect()

```java
import java.util.List;

public class TransformacaoStream {
    public static void main(String[] args) {
        List<String> palavras = List.of("java", "stream", "api", "lambda", "method", "reference");
        
        // 1. Mapear para o tamanho de cada palavra e calcular a soma total
        int somaTamanhos = /* seu código aqui */;
        
        // 2. Filtrar palavras com mais de 4 letras e transformar em maiúsculas
        List<String> palavrasFiltradas = /* seu código aqui */;
        
        System.out.println("Soma dos tamanhos: " + somaTamanhos);
        System.out.println("Palavras filtradas: " + palavrasFiltradas);
    }
}
```

#### 3. Streams com Objetos Complexos

* Implemente usando filter(), map(), average(), min() e Collectors

```java
import java.util.List;
import java.util.stream.Collectors;

class Produto {
    String nome;
    double preco;
    
    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}

public class StreamProdutos {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
            new Produto("Notebook", 3500.0),
            new Produto("Smartphone", 2500.0),
            new Produto("Tablet", 1800.0),
            new Produto("Monitor", 1200.0)
        );
        
        // 1. Listar nomes dos produtos com preço > 2000
        List<String> produtosCaros = /* seu código aqui */;
        
        // 2. Calcular preço médio dos produtos
        double precoMedio = /* seu código aqui */;
        
        // 3. Encontrar o produto mais barato
        String maisBarato = /* seu código aqui */;
        
        System.out.println("Produtos caros: " + produtosCaros);
        System.out.println("Preço médio: " + precoMedio);
        System.out.println("Mais barato: " + maisBarato);
    }
}
```

## Exceptions and Localization
## Modules
## Concurrency
## I/O
