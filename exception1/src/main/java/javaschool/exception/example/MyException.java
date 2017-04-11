package javaschool.exception.example;

/**
 * Created by 8 on 11.04.2017.
 */
public class MyException extends Exception {
    //public static final long serialVersionUID = 1;    // Пример сериализации

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
