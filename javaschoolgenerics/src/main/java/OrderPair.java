/**
 * Created by 8 on 04.04.2017.
 */
public class OrderPair<K,V> implements Pair<K,V> {
    private K key;
    private V value;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
    public OrderPair (K key,  V value) {
        this.key = key;
        this.value = value;
    }

}
