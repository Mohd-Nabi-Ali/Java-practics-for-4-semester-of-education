package prac3;
import com.sun.javafx.collections.MappingChange;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

public class MySafeMap<V,K> implements Map<V,K> {
    private static final Semaphore semaphore = new Semaphore(1);
    private Map<V,K> my_map=new HashMap<V,K>();
    @Override
    public String toString() {
        return "MySafeMap{" +
                "my_map=" + my_map +
                '}';
    }
    @Override
    public int size() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.size();
    }
    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.isEmpty();
    }
    @Override
    public boolean containsKey(Object o) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.containsKey(o);
    }
    @Override
    public boolean containsValue(Object o) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.containsValue(o);
    }
    @Override
    public K get(Object o) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.get(o);
    }
    @Override
    public K put(V v, K k) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.put(v,k);
    }
    @Override
    public K remove(Object o) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.remove(o);
    }
    @Override
    public void putAll(Map<? extends V, ? extends K> map) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        my_map.putAll(map);
    }
    @Override
    public void clear() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        my_map.clear();
    }
    @Override
    public Set<V> keySet() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.keySet();
    }
    @Override
    public Collection<K> values() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.values();
    }
    @Override
    public Set<Entry<V, K>> entrySet() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        return my_map.entrySet();
    }
}

