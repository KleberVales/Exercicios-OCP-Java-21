package LambdasAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class Exercicio6 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lucas", "Julia", "Marcos");

        List<Pessoa> pessoas = nomes.stream()
                .map(Pessoa::new)
                .collect(Collectors.toList());

        pessoas.forEach(p -> System.out.println(p.getNome()));
    }
}

