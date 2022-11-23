package edu.lucas.marathon.B02JavaCore.A04Constructors.test;

import edu.lucas.marathon.B02JavaCore.A04Constructors.domain.Movie;

public class MovieTest {
    public static void main(String[] args) {
        // Construtor vazio
        Movie movieOne = new Movie();

        // Sobrecarga de construtor com argumentos

        Movie movieThree = new Movie("O Senhor dos Anéis", "Aventura", 180);

        Movie movieExample = new Movie("O Senhor dos Anéis", "Aventura", 180, "Exemplo estudio");
    }
}
