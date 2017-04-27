import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 8 on 27.04.2017.
 */
public class Starter {
    public static void main(String[] args) {
        Apple a1 = new Apple("green",150);
        Apple a2 = new Apple("red",155);
        Apple a3 = new Apple("green",151);
        List<Apple> apples = new ArrayList<>();
        apples.addAll(Arrays.asList(a1, a2, a3));
        // Для реализации можно было создать описание предикатов, но по новому мы описываем реализацию прям тут.
        // Лямда вообще соокращает описание реализации до одной строки
        System.out.println(filterApple(apples, apple -> "green".equals(apple.getColor())));
        // Alt+enter - Replace with Lamda - переделывает в упрощённый код лямда.
        System.out.println(filterApple(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        }));
    }

    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if (p.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }
}
