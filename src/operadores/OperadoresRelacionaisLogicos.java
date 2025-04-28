package operadores;

import java.util.Scanner;

public class OperadoresRelacionaisLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        boolean maiorEPositivo = (a > b) && (a > 0);
        boolean diferentesOuZero = (a != b) || (a == 0 && b == 0);

        System.out.println("O primeiro número é maior que o segundo e positivo? " + maiorEPositivo);
        System.out.println("Os números são diferentes ou ambos são zero? " + diferentesOuZero);

        scanner.close();
    }
}

