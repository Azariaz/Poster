package ru.netology.poster;

import ru.netology.film.Film;

public class PosterManager {
    private int numOfFilms = 5;
    private Film[] films = new Film[numOfFilms];

    public PosterManager() {
    }

    public PosterManager(int numOfFilms) {
        this.numOfFilms = numOfFilms;
        films = new Film[numOfFilms];
    }

    public Film[] findAll() {
        return films;
    }

    public void addFilm(Film film) {
        Film[] tmp = films;
        int firstNull = get1stNullOf(tmp);
        if (firstNull == tmp.length) {
            tmp = new Film[films.length + 1];
            tmp[tmp.length - 1] = film;
        } else {
            tmp[firstNull] = film;
        }
    }

    private int get1stNullOf(Film[] tmp) {
        for (int f = 0; f < tmp.length; f++) {
            if (tmp[f] == null)
                return f;
        }
        return tmp.length;
    }

    public Film[] findLast(int count) {
        Film[] all = films;
        Film[] reversed = new Film[count];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
