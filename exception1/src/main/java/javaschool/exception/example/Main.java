package javaschool.exception.example;

/**
 * Пример отлавливания исключений
 * Created by 8 on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        anyMentod();
    }

    public static void anyMentod() {
        divisionByZero();
    }

    public static void divisionByZero() {
        System.out.println(1/0);
    }
}
