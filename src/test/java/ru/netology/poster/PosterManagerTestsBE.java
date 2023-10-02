package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.film.Film;

public class PosterManagerTestsBE {

    PosterManager post = new PosterManager();

    Film film1 = new Film(1, "Первый фильм");
    Film film2 = new Film(2, "Второй фильм");
    Film film3 = new Film(3, "Третий фильм");
    Film film4 = new Film(4, "Четвертый фильм");
    Film film5 = new Film(5, "Пятый фильм");
    Film film6 = new Film(6, "Шестой фильм");

    @BeforeEach
    public void setup() {
        post.addFilm(film1);
        post.addFilm(film2);
        post.addFilm(film3);
        post.addFilm(film4);
        post.addFilm(film5);
    }


    @Test
    public void shouldAddFilms() {                                  // добавление с пустым конструктором
        Film[] expected = {film1, film2, film3, film4, film5};
        Film[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnFixedLength() {                           // фиксированный размер
        post.addFilm(film6);

        Film[] expected = {film1, film2, film3, film4, film5};
        Film[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimit3() {                           // вывод всех фильмов в обратном порядке добавления, лимит 3
        Film[] expected = {film5, film4, film3};                   // пустой конструктор
        Film[] actual = post.findLast(3);

        Assertions.assertArrayEquals(expected, actual);
    }
}
