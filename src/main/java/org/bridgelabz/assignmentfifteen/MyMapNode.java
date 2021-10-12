package org.bridgelabz.assignmentfifteen;

public class MyMapNode<K, V> implements INode<K> {
    K key;
    V value;
    MyMapNode<K,V> next;

    /***
     *
     * @param key
     * @param value
     * @param next
     */

    public MyMapNode(K key, V value, MyMapNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = null;
    }



    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;

    }

    @Override
    public INode <K> getNext() {
        return next;
    }

    public V getValue(){
        return this.value;
    }

    public  void setValue(V value){
        this.value = value;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = (MyMapNode<K, V>) next;  //type casting
    }

    /***
     *
     * @return
     */

    @Override
    public String toString(){
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{ " + " K= ").append(key)
                .append(" V = ").append(value).append('}');
        if ( (next != null)) myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }
}
