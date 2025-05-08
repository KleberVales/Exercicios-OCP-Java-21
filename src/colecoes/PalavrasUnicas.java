package colecoes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalavrasUnicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> palavras = new HashSet<>();
        String entrada;

        System.out.println("Digite palavras (digite 'sair' para encerrar):");
        while (true) {
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            palavras.add(entrada);
        }

        System.out.println("\nPalavras digitadas (sem repetição):");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        scanner.close();
    }
}
