package vault.implement;

import vault.concept.Predicate;
import vault.concept.UniVault;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 8 on 06.04.2017.
 */
public class HashMapVault<K,V> implements UniVault<K,V> {
    private Map<K,V> map = new HashMap<K,V>();


    public void put(K key, V value) {
        map.put(key,value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void putAll(Map<K, V> entries) {
        map.putAll(entries);
    }

    public Map<K, V> getAllByKeys(Collection<K> keys) {
        Map<K,V> innerMap = new HashMap<K, V>();


        for (K key : keys) {
            innerMap.put(key,map.get(key));
        }

        return innerMap;
    }

    public Collection<V> getAllByPredicate(Predicate<? super V> p) {
        Collection<V> collection = new ArrayList<V>();
        for (V v : map.values()) {
            if (p.apply(v))
                collection.add(v);
        }
        return collection;
    }

    @Override
    public String toString() {
        return map.toString();

    }

}
