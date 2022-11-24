package structure_implement;

import base.Node;
import base.NodeKV;

public class Map<K, V> {
    private int size = 0;
    private NodeKV<K, V> head;
    private NodeKV<K, V> rear;
    public V get (K key){
        NodeKV<K,V> temp=head;
        while (true){
            if(size==0||temp==null){
                return null;
            }
            if(temp.getKey().equals(key)){
               break;
            }
            temp=temp.getNext();
        }
        return temp.getValue();
    }
    public  void put(K key , V value){
        NodeKV<K,V> temp =new NodeKV<>(key,value);
        if(rear==null){
            this.head = this.rear = temp;
            return;
        }
        this.rear.setNext(temp);
        this.rear=temp;
        size++;
    }
    public int size() {
        return size;
    }
    public void remove(K key) {
        NodeKV<K,V> temp=head;
        NodeKV<K,V> previous=null;
        while (true){
            if(size==0||temp==null){
                return ;
            }
            if(temp.getKey().equals(key)){
                if(previous!=null){
                    previous.setNext(temp.getNext());
                }
                temp.setNext(null);
                this.size--;
                return;
            }

            previous=temp;
            temp=temp.getNext();
        }

    }
}
