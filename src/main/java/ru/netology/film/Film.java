package ru.netology.film;

public class Film {
    private int id;
    private String filmName;

    public Film(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}
