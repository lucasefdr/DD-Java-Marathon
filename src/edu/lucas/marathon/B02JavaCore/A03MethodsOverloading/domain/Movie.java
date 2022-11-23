package edu.lucas.marathon.B02JavaCore.A03MethodsOverloading.domain;

public class Movie {
    private String name;
    private String genre;
    private Integer length;

    /**
     * Construtor vazio
     */
    public Movie() {
    }

    /**
     * Construtor com parâmetro
     *
     * @param name
     * @param genre
     * @param length
     */
    public Movie(String name, String genre, Integer length) {
        this.name = name;
        this.genre = genre;
        this.length = length;
    }

    public void init (String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    /**
     * Sobrecarga do método <strong>init</strong>
     * @param name
     * @param genre
     * @param length
     */
    public void init (String name, String genre, Integer length) {
        this.init(name, genre);
        this.length = length;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.genre);
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
