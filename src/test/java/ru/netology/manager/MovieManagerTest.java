package ru.netology.manager;

import static org.junit.jupiter.api.Assertions.*;

        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import ru.netology.domain.MovieItem;

//используется  конструктор с вводом для пользователя

public class MovieManagerTest {
    MovieManager manager = new MovieManager(10);
    MovieItem first = new MovieItem(1, 1, "Бладшот");
    MovieItem second = new MovieItem(2, 2, "Вперёд");
    MovieItem third = new MovieItem(3, 3, "Отель Белград");
    MovieItem fourth = new MovieItem(4, 4, "Джентельмены");
    MovieItem fifth = new MovieItem(5, 5, "Человек-невидимка");
    MovieItem sixth = new MovieItem(6, 6, "Тролли.Мировой тур");
    MovieItem seventh = new MovieItem(7, 7, "Номер один");
    MovieItem eighth = new MovieItem(8, 8, "8");
    MovieItem ninth = new MovieItem(9, 9, "9");
    MovieItem tenth = new MovieItem(10, 10, "10");
    MovieItem eleventh = new MovieItem(11,11,"11");


    @Test

    public void shouldLowCustomThenLength() {
        //создаем менеджера, которому пользователь написал 7
        manager = new MovieManager(7);
//Добавляем 10 фильмов
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

//вызываем метод getAll, который даст последние 7 фильмов, по пользовательскому запросу
        MovieItem[] actual = manager.getAll();
//Создаем ожидаемый результат: выдалось последние 7 фильмов, из имеющихся 10
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth};
//сравниваем ожидаемое и полученное
        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldLongerCustomThenLength() {
        manager = new MovieManager(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }

//используется  конструктор с автовводом



    @Test

    void shouldAutoLowCustomThenLength() {
        MovieManager managerAuto = new MovieManager();
//Добавляем 10 фильмов
        managerAuto.add(first);
        managerAuto.add(second);
        managerAuto.add(third);
        managerAuto.add(fourth);
        managerAuto.add(fifth);
        managerAuto.add(sixth);
        managerAuto.add(seventh);
        managerAuto.add(eighth);
        managerAuto.add(ninth);
        managerAuto.add(tenth);

//вызываем метод getAll, который даст последние  фильмов, по пользовательскому запросу
        MovieItem[] actual = managerAuto.getAll();
//Создаем ожидаемый результат: выдалось последние 10 фильмов, из имеющихся 10
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
//сравниваем ожидаемое и полученное
        assertArrayEquals(expected, actual);
    }

    @Test

    void shouldAutoLongerCustomThenLength () {
        //создаем менеджера, при авто вводе более 10
        MovieManager managerAuto = new MovieManager();
//Добавляем 10 фильмов
        managerAuto.add(first);
        managerAuto.add(second);
        managerAuto.add(third);
        managerAuto.add(fourth);
        managerAuto.add(fifth);
        managerAuto.add(sixth);
        managerAuto.add(seventh);
        managerAuto.add(eighth);
        managerAuto.add(ninth);
        managerAuto.add(tenth);
        managerAuto.add(eleventh);

//вызываем метод getAll, который даст последние 10 фильмов, как указано в условии
        MovieItem[] actual = managerAuto.getAll();
//Создаем ожидаемый результат: выдалось последние 10 фильмов, из имеющихся 10
        MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
//сравниваем ожидаемое и полученное
        assertArrayEquals(expected, actual);
    }
}

