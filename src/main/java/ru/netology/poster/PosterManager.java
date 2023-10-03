package ru.netology.poster;

import ru.netology.film.Film;

public class PosterManager {
    private int limit = 5;
    private Film[] films = new Film[0];

    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public Film[] findAll() {
        return films;
    }

    public void addFilm(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findLast() {
        Film[] all = films;
        Film[] reversed = new Film[limit];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}
