package baseNode;

public class NodeKV<K, V> {
    private final K key;
    private final int hash;
    private V value;
    private NodeKV<K, V> next;

    public NodeKV(K key, V value, NodeKV<K, V> next) {
        this.key = key;
        this.hash = hashCode();
        this.value = value;
        this.next = next;
    }

    public NodeKV(K key, V value) {
        this.key = key;
        this.hash = hashCode();
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

    public int getHash() {
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "NodeKV{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
