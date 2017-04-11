package javaschool.exception.example;

/**
 * Created by 8 on 11.04.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            anyMethod();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void anyMethod() throws MyException {
        if(true){
            throw new MyException("Бросаем исключение");
        }
    }
}
