import java.lang.reflect.Field;

/**
 * Created by 8 on 13.04.2017.
 */
public class Test_01 {

//    static {
//        Class<?>[] declaredClasses = Integer.class.getDeclaredClasses();
//        Class<?> declareedClasses = declaredClasses();
//        try {
//            Field cache = declaredClasses[0].getField("cache");
//            cache.setAccessible(true);
//            ((Integer[]). cache.get(null))[128 + 20] = 30;
//        } catch {
//
//        }
//
//    }

    public static void main(String[] args) {
        Integer b1 = 20;
        Integer b2 = 20;
        if (b1 + b2 == 60){
            System.out.println("WOW");
        }

    }
}
