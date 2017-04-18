/**
 * Created by 8 on 13.04.2017.
 */
public class Test_02 {
    public static void main(String[] args) {
        Class<Integer> integerClass = Integer.class;
        Integer i = 30;
        Class aClass = i.getClass();
        aClass.getName();
        System.out.println(aClass.getName());
    }
}
