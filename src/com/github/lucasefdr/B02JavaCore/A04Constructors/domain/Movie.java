package com.github.lucasefdr.B02JavaCore.A04Constructors.domain;

public class Movie {
    private String name;
    private String genre;
    private Integer length;
    private String studio;

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

    /**
     * Sobrecarga de construtores
     *
     * @param name
     * @param genre
     * @param length
     * @param studio
     */
    public Movie(String name, String genre, Integer length, String studio) {
        this(name, genre, length);
        this.studio = studio;
    }

    public void init(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    /**
     * Sobrecarga do método <strong>init</strong>
     *
     * @param name
     * @param genre
     * @param length
     */
    public void init(String name, String genre, Integer length) {
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

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
