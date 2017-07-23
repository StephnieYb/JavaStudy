package com.example;
/**
 * Created by yxc on 2017/6/26.
 */

/**
 * 链式栈
 */
public class LinkedStack {
    //定义count
    int count;//栈内元素的个数
    int capacity;//栈的容量
    public Node top; //指向栈顶
    /**
     * 栈包括指向栈顶的结点+count变量指示栈的大小，构造函数LinkedStack，构造一个空的栈，初始化所有变量
     */
    public LinkedStack(){

        count=0;
        top=null;
        capacity=0;

    }

    /**
     * 自定义栈的容量capacity
     * @return
     */

    public void setcapacity(int capacity){
        this.capacity=capacity;
    }

    /**
     * 获取当前栈的长度
     * @return
     */
    public int getSize(){
        return count;

    }

    public boolean isEmpty(){
        return (getSize()==0);
    }

    /**
     * 若栈内元素数量和栈的容量相等，则栈满，返回false
     * @return
     */
    public boolean isFull(){
        if (count == capacity)
            return true;
        return false;
    }

    /**
     * 出栈，并返回出栈的元素
     * @return
     */
    public Object pop(){
        if(isEmpty())
        {
            System.out.println("stack is empty!");
            System.exit(1);
        }
        Object result=top.value;
        top=top.next;
        count--;
        return result;
    }

    /**
     * 把val对象入栈
     * @param val
     */
    public void push(int val){
        Node newElements=new Node(val);
        if (this.isFull())
        {

        System.out.println("stack is full!");
            return;
        }

        newElements.next=top;
        top = newElements;
        count++;

    }
    public static class Node {
        int value;
         Node next;    //节点指向的下一个节点

        //Node的构造函数，不能有返回值，可直接new这个类
        public Node(int i) {
            this.value = i;   //形参i传入的节点赋值给头节点
            this.next = null;  //引用下一个节点
        }
    }
}


