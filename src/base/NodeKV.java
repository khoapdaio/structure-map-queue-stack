package base;

public class NodeKV <K,V>{
    private final K key;
    private  V value;
    private  NodeKV<K,V>  next;

    public NodeKV(K key, V value, NodeKV<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public NodeKV(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public NodeKV<K, V> getNext() {
        return next;
    }

    public void setNext(NodeKV<K, V> next) {
        this.next = next;
    }
}
