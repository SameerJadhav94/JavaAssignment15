package org.bridgelabz.assignmentfifteen;


public class MyHashMap<K, V> {
    MyLinkedList <K> myLinkedList;

    public MyHashMap() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public V get (K key){
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        if (myMapNode == null){
            myMapNode = new MyMapNode<>(key, value, null);
            this.myLinkedList.append(myMapNode);
        }else {
            myMapNode.setValue(value);
        }
    }

    /***
     *
     * @return
     */

    @Override
    public String toString(){
        return "MyHashMapNodes{" + myLinkedList + '}';
    }


    public static void main(String[] args )
    {

    }




}
