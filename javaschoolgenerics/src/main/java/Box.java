/**
 * Created by 8 on 04.04.2017.
 */
public class Box<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {

        return t;
    }

    public Box(T t) {

        this.t = t;
    }
}
