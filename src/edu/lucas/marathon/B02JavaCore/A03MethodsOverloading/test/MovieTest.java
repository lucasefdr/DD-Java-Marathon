package edu.lucas.marathon.B02JavaCore.A03MethodsOverloading.test;

import edu.lucas.marathon.B02JavaCore.A03MethodsOverloading.domain.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.init("O Senhor dos Anéis", "Aventura");

        Movie movieTwo= new Movie();
        movieTwo.init("Harry Potter", "Aventura", 120);
    }
}
