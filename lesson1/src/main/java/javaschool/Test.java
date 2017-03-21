package javaschool;

/**
 * Created by 8 on 21.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        //long 100000000;
        String test = null;
/*        if (test == null) ||(test.startsWith("123")) {
            System.out.println("ok");
        }
*/
        byte a = 100;
        byte b = 100;
        //byte d = (byte) a + b; // тоже самое, что d += a;
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY); // результат 5 из-за переполнения значения int, поэтому нужно складывать в типе long
    }

    new Person("John",12);
    public class Parent {
        String field = getString1("field");
       // static String field2 = getString1("")
    }
}
