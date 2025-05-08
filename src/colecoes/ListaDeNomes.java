package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes.add(scanner.nextLine());
        }

        System.out.println("\nLista original:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        Collections.sort(nomes);

        System.out.println("\nLista ordenada:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

