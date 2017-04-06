import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8 on 04.04.2017.
 */
public class MainGenerics {


    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("String");
//
//        String s = (String) list.get(0);
//        System.out.println(s);

//        Box<String> stringBox = new Box<String>("String");
//        Map<String,Box<String>> map = new HashMap<>();

        Pair<String,Integer> pair = new OrderPair<> ("key",0);
        Pair<Box<String>, String> stringPair = new OrderPair<>(new Box<>("String"),"MyString");

        InvokeResult<String> invokeResult = Utils.returnString();
        if (invokeResult.getInvokeResult()){
            System.out.println("All ok:" + invokeResult.getT());
        } else{
            System.out.println("Error");
        }

//        Utils.paramInvoke(new Box<>("MyString")); // сокращённый вариант написания, где мы не следим за типоом параметров.
        Utils.<Box<String>>paramInvoke(new Box<String>("MyString"));
        //Utils.paramInvokeBounded()
    }
}
