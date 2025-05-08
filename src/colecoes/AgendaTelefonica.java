package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();
        String nome, telefone;

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) break;

            System.out.print("Digite o telefone: ");
            telefone = scanner.nextLine();
            agenda.put(nome, telefone);
        }

        System.out.print("\nDigite o nome para buscar o telefone: ");
        String busca = scanner.nextLine();
        if (agenda.containsKey(busca)) {
            System.out.println("Telefone de " + busca + ": " + agenda.get(busca));
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println("\nAgenda completa:");
        for (Map.Entry<String, String> contato : agenda.entrySet()) {
            System.out.println(contato.getKey() + " -> " + contato.getValue());
        }

        scanner.close();
    }
}

