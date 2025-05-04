package LambdasAndFunctionalInterfaces;

import java.util.function.Predicate;

public class Exercicio1 {
    public static void main(String[] args) {
        int limite = 10; // variável efetivamente final

        Predicate<Integer> menorQueLimite = numero -> numero < limite;

        System.out.println(menorQueLimite.test(5));   // true
        System.out.println(menorQueLimite.test(15));  // false

        // limite = 20;  // ❌ Isso causaria erro de compilação
    }
}
