package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.film.Film;

public class PosterManagerTests {

    Film film1 = new Film(1, "Первый фильм");
    Film film2 = new Film(2, "Второй фильм");
    Film film3 = new Film(3, "Третий фильм");
    Film film4 = new Film(4, "Четвертый фильм");
    Film film5 = new Film(5, "Пятый фильм");
    Film film6 = new Film(6, "Шестой фильм");


    @Test
    public void shouldFindAll() {                           // вывод всех фильмов в порядке добавления, пустой конструктор
        PosterManager post = new PosterManager();

        post.addFilm(film2);
        post.addFilm(film1);
        post.addFilm(film5);
        post.addFilm(film4);
        post.addFilm(film3);

        Film[] expected = {film2, film1, film5, film4, film3};
        Film[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFilms3() {                          // добавление, размер 3
        PosterManager post = new PosterManager(3);

        post.addFilm(film1);
        post.addFilm(film2);
        post.addFilm(film3);

        Film[] expected = {film1, film2, film3};
        Film[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll6() {                           // вывод всех фильмов в порядке добавления, размер 6
        PosterManager post = new PosterManager(6);

        post.addFilm(film1);
        post.addFilm(film2);
        post.addFilm(film3);
        post.addFilm(film4);
        post.addFilm(film5);
        post.addFilm(film6);

        Film[] expected = {film1, film2, film3, film4, film5, film6};
        Film[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimit5() {                           // вывод всех фильмов в обратном порядке добавления, лимит 5
        PosterManager post = new PosterManager(6);

        post.addFilm(film1);
        post.addFilm(film2);
        post.addFilm(film3);
        post.addFilm(film4);
        post.addFilm(film5);
        post.addFilm(film6);

        Film[] expected = {film6, film5, film4, film3, film2};
        Film[] actual = post.findLast(5);

        Assertions.assertArrayEquals(expected, actual);
    }
}
