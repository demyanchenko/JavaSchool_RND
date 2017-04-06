/**
 * Created by 8 on 04.04.2017.
 */
public class InvokeResult<T> {
    T t;
    Boolean invokeResult;

    public T getT() {
        return t;
    }

    public Boolean getInvokeResult() {
        return invokeResult;
    }

    public void setT(T t) {

        this.t = t;
    }

    public void setInvokeResult(Boolean invokeResult) {
        this.invokeResult = invokeResult;
    }
}
