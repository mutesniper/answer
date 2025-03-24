package question7;



public class test {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        MyLinkedList.Node<Integer> node1 = new MyLinkedList.Node<>(1, null, null);
        MyLinkedList.Node<Integer> node2 = new MyLinkedList.Node<>(2, null, null);
        MyLinkedList.Node<Integer> node3 = new MyLinkedList.Node<>(3, null, null);
        MyLinkedList.Node<Integer> node4 = new MyLinkedList.Node<>(4, null, null);
        MyLinkedList.Node<Integer> node5 = new MyLinkedList.Node<>(5, null, null);

        list.addList(node1);
        list.addList(node2);
        list.addList(node3);
        list.addList(node4);
        list.addList(node5);
        //初始数据
        list.printList();
        //按值删除方法
        list.removeListByValue(2);
        list.printList();
        //按值查找
        System.out.println(list.find(3));
        //移除末尾元素
        list.removeList0();
        list.printList();
    }
}
