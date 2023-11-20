package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * FIFO (First In First Out)
 */
public class QueueApp {
    static int[] myQueue = new int[10];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void enQueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        myQueue[++top] = val;
    }

    public static int deQueue() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        int valueToReturn = myQueue[0];

        myQueue = Arrays.copyOfRange(myQueue, 1, myQueue.length + 1);
        top--;
        return valueToReturn;
    }

    public static boolean isEmpty() {
        return (top == -1);
    }

    public static boolean isFull() {
        return (top == myQueue.length - 1);
    }

    public static void traverseQueue() {
        if (isEmpty()) return;
        for (int i = 0; i <= top; i++) {
            System.out.print(myQueue[i] +" ");
        }
        System.out.println();
    }
}
