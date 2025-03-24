package question7;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;
    private Node<T> tail;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    static class Node<T> {
        T data;
        Node next;
        Node prev;
        public Node(T data,Node<T> prev,Node<T> next){
            this.data = data;
            this.next = next;
            this.prev=prev;
        }
    }

    public int size() {
        return size;
    }

    public boolean addList(Node<T> node){
        if(head == null){
            head = node;
            tail = node;
            node.prev=node.next=null;
        } else {
            node.prev=tail;
            tail.next = node;
            tail = node;
            node.next=null;
        }
        size++;
        return true;
    }

    public void removeList0(){
        if(head == null){
            return;
        } else if(head == tail) {
            head = null;
            tail = null;
            size--;
        } else {
            tail=tail.prev;
            tail.next = null;
            size--;
        }
    }
    //根据linkedList的remove方法定义为只删除第一个符合的元素
    public void removeListByValue(int value){
        if(head == null){
            return;
        }
        Node<T> node = head;
        while (node != null) {
            if (node.data.equals(Integer.valueOf(value))) {
                if (node == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                    else tail = null;
                } else if (node == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
                size--;
                break;
            }
            node = node.next;
        }
    }

    //-1表示不存在
    public int find (int value){
        if(head == null){
            return -1;
        }
        int count=0;
        Node<T> node=head;
        while(node!=null){
            if(node.data.equals(Integer.valueOf(value))){
                return count;
            }
            node=node.next;
            count++;
        }
        return -1;

    }

    public void printList(){
        if(head == null){
            return;
        }
        Node<T> node = head;
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }






}
