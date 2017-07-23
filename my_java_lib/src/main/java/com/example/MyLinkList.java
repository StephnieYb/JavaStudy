package com.example;


public class MyLinkList {
    public Node head;//head指向链表头节点
    public Node last;//last始终指向尾节点


    public static void main(String args[]) {
        MyLinkList list = new MyLinkList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(5);
        list.addNodeAfterPosition(2, 6);
        list.addNode(39);

        list.visit();


//        list.visit();

        System.out.print(list.getSize());


    }
    //构造函数

    //链表属性=节点数+头节点
    //创建节点=每个节点存储的数据+引用下一个节点next，内部类
    public static class Node {
        int value;
        Node next;    //节点指向的下一个节点

        //Node的构造函数，不能有返回值，可直接new这个类
        public Node(int i) {
            this.value = i;   //形参i传入的节点赋值给头节点
            this.next = null;  //引用下一个节点
        }

    }

    //构造方法--获取链表大小
    public int getSize() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    /**
     * 在末尾增加一个Node
     *
     * @param num
     */
    public void addNode(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            last = head;
            return;
        }
        last.next = newNode;
        last = last.next;
    }

    /**
     * 在第pos个Node后增加Node
     *
     * @param pos
     * @param num
     */
    public void addNodeAfterPosition(int pos, int num) {
        Node node = new Node(num);

        int i = 1;
        Node cursor = head;

        if (pos <= 0) {
            node.next = head;
            head = node;
            return;
        }
        while (i < pos && cursor != null) {
            cursor = cursor.next;
            i++;
        }

        node.next = cursor.next;
        cursor.next = node;

        if (node.next == null) {
            last = node;
        }
    }

    private void visit() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteNode(int num) {
        if (head == null) {
            System.out.print("there is nothing in MyLInkList");
            return;
        }

        if (head.value == num) {
            head = head.next;
            return;
        }

        Node pre = head;
        while (pre.next != null) {
            if (pre.next.value == num) {
                pre.next = pre.next.next;
                break;
            }
            pre = pre.next;
        }
    }


}
