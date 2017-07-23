package com.example;

import java.util.Scanner;

/**
 * Created by yxc on 2017/6/25.
 */

public class Queue {
    int[] elements;
    int front, rear;
    int capacity;//容量，自己固定
    int size;//当前个数

    public Queue(int capacity) {
        elements = new int[capacity];
        this.capacity = capacity;
        front = rear = 0;
        size = 0;
    }

    //入队--队尾增加一个
    public void add(int n) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        //rear队尾元素，next指向队尾的下一个元素
        int next = (rear + 1) % capacity;
        elements[next] = n;
        rear = next;//插入新的元素后，rear指向新的元素，始终指向队尾

        size++;
    }

    //出队--从对头移除一个
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        size--;
        front = (front + 1) % capacity;
        return elements[front];
    }


    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        int next = (rear + 1) % capacity;
        return front == next;
    }

    public int size() {
        return size;
    }

    public void visit() {
        if (isEmpty()) {
            System.out.println("the size of queue: " + size);
            return;
        }

        System.out.print("[");
        for (int i = (front + 1) % capacity, end = (rear + 1) % capacity; i != end; i = (i + 1) % capacity) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("]\nthe size of queue: " + size);
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                queue.add(scanner.nextInt());
                queue.visit();
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }

        System.out.println(queue.remove() + " is removed");
        queue.visit();
    }

}
