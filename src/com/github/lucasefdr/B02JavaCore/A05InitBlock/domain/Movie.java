package com.github.lucasefdr.B02JavaCore.A05InitBlock.domain;

import java.util.List;

public class Movie {
    private String name;
    private List<String> actors = List.of("Lucas", "Eduardo", "Paulo");
    /*
    Sequência de construção de um objeto:
    1 - Alocação do espaço em memória paro o objeto
    2 - Cada atributo de classe é criado e inicializado com valores default ou o que é passado
    3 - Bloco de inicialização é executado
    4 - Construtor é executado
     */

    // Blocos de inicialização: bloco inicializado antes do construtor
    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Movie() {
        // Método de referência
        actors.forEach(System.out::println);
    }

    public String getName() {
        return name;
    }

    public List<String> getActors() {
        return actors;
    }
}