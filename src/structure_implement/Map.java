package structure_implement;

import baseNode.NodeKV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Map<K, V> {
    static int CAPACITY = 8;
    private int size = 0;
    private NodeKV<K, V>[] hashTable;

    public Map() {
        hashTable = new NodeKV[CAPACITY];
    }

    public void put(K key, V value) {
        NodeKV<K, V> newNodeKV = new NodeKV<>(key, value);
        int hashValue = newNodeKV.getKey().hashCode() & (CAPACITY - 1);
        NodeKV<K, V> headElementOfBucket = hashTable[hashValue];
        if (headElementOfBucket == null) {
            hashTable[hashValue] = newNodeKV;
            size++;
            return;
        }
        if (headElementOfBucket.getNext() == null) {
            if (headElementOfBucket.getKey().equals(key)) {
                headElementOfBucket.setValue(value);
            } else {
                headElementOfBucket.setNext(newNodeKV);
                size++;
            }
            return;
        }
        NodeKV<K, V> lastElementOfBucket = headElementOfBucket;
        while (lastElementOfBucket.getNext() != null) {
            lastElementOfBucket = lastElementOfBucket.getNext();
            if (headElementOfBucket.getKey().equals(key)) {
                headElementOfBucket.setValue(value);
                return;
            }
        }
        lastElementOfBucket.setNext(newNodeKV);
        size++;
    }

    public V get(K key) throws NullPointerException {
        int hashValue = key.hashCode() & (10 - 1);
        NodeKV<K, V> headElementOfBucket = hashTable[hashValue];
        if (headElementOfBucket.getKey().equals(key)) {
            return headElementOfBucket.getValue();
        }
        if (headElementOfBucket.getNext() == null) {
            return null;
        }
        NodeKV<K, V> elementToFindInBucket = headElementOfBucket;
        while (elementToFindInBucket.getNext() != null) {
            elementToFindInBucket = elementToFindInBucket.getNext();
            if (elementToFindInBucket.getKey().equals(key)) {
                return elementToFindInBucket.getValue();
            }
        }
        return null;
    }

    public boolean remove(K key) {
        int hashValue = key.hashCode() & (10 - 1);
        NodeKV<K, V> headElementOfBucket = hashTable[hashValue];
        if (headElementOfBucket.getKey().equals(key)) {
            if (headElementOfBucket.getNext() == null) {
                hashTable[hashValue] = null;
                size--;
                return true;
            }
            headElementOfBucket = headElementOfBucket.getNext();
            hashTable[hashValue] = headElementOfBucket;
        }
        if (headElementOfBucket.getNext() == null) {
            hashTable[hashValue] = null;
            size--;
            return true;
        }
        NodeKV<K, V> elementToCheckForRemoveInBucket = headElementOfBucket;
        while (elementToCheckForRemoveInBucket.getNext() != null) {
            NodeKV<K, V> elementPrevious = elementToCheckForRemoveInBucket;
            elementToCheckForRemoveInBucket = elementToCheckForRemoveInBucket.getNext();
            if (elementToCheckForRemoveInBucket.getKey().equals(key)) {
                elementPrevious.setNext(elementToCheckForRemoveInBucket.getNext());
                elementToCheckForRemoveInBucket.setNext(null);
                size--;
                return true;
            }
        }
        return false;
    }

    public void display() throws NullPointerException {
        for (NodeKV<K, V> element : hashTable) {
            if (element == null) {
                System.out.println("null");
                continue;
            }
            System.out.print(element);
            while (element.getNext() != null) {
                element = element.getNext();
                System.out.print("," + element);
                if (element == null) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }

    public List<K> getKey() {
        List<K> listKey = new ArrayList<>();
        for (NodeKV<K, V> element : hashTable) {
            if (element == null) {
                continue;
            }
            listKey.add(element.getKey());
            while (element.getNext() != null) {
                element = element.getNext();
                listKey.add(element.getKey());
            }
        }
        return listKey;
    }
    public List<V> getValue() {
        List<V> listValue = new ArrayList<>();
        for (NodeKV<K, V> element : hashTable) {
            if (element == null) {
                continue;
            }
            listValue.add(element.getValue());
            while (element.getNext() != null) {
                element = element.getNext();
                listValue.add(element.getValue());
            }
        }
        return listValue;
    }

    public int size() {
        return size;
    }
}
