/**
 * Created by 8 on 04.04.2017.
 */
public class Utils {
    public static Integer returnInteger() {
        InvokeResult<String> integerInvokeResult = new InvokeResult<>(1);
        integerInvokeResult.setInvokeResult(true);
        return new Integer(1);
    }

    public static InvokeResult<String> returnString() {
        return new InvokeResult<>("MyString");

    }
    public static <U extends Number> void paramInvoke(U myParam){
        System.out.println(myParam.toString());
        //return myParam;
    }

    public static Number paramInvokeBounded(Number myParam){
        System.out.println(myParam.toString());
        return myParam;
    }
    public static <U extends Integer & ClientStorage & Persistable> U getPersistableClient(U persistableClient){
        return persistableClient;
    }
}
