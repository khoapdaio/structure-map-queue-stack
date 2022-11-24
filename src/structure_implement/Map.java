package structure_implement;

import base.Node;
import base.NodeKV;

public class Map<K, V> {
    private int size = 0;
    private NodeKV<K, V> head;
    private NodeKV<K, V> rear;

    public V get(K key) {
        NodeKV<K, V> temp = head;
        while (true) {
            if (size == 0 || temp == null) {
                return null;
            }
            if (temp.getKey().equals(key)) {
                break;
            }
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    public NodeKV<K, V> put(K key, V value) {
        NodeKV<K, V> temp = head;
        NodeKV<K, V> newNode = new NodeKV<>(key, value);
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                temp.setValue(value);
                return newNode;
            }
            temp = temp.getNext();
        }
        if (rear == null) {
            this.head = this.rear = newNode;
            return newNode;
        }
        this.rear.setNext(newNode);
        this.rear = newNode;
        size++;
        return newNode;

    }

    public int size() {
        return size;
    }

    public boolean remove(K key) {
        NodeKV<K, V> temp = head;
        NodeKV<K, V> previous = null;
        if (size == 0) {
            return false;
        }
        while (true) {
            if (temp == null) {
                return false;
            }
            if (temp.getKey().equals(key)) {
                if (previous != null) {
                    previous.setNext(temp.getNext());
                }
                temp.setNext(null);
                this.size--;
                return true;
            }
            previous = temp;
            temp = temp.getNext();
        }

    }
}
