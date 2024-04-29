package gr.aueb.cf6.ch6;

/**
 * Queue is FIFO (First-in First-out)
 * Demo impl with arrays.
 */
public class QueueApp_10 {

    static int[] queue = new int[100];
    static int pivot = -1;

    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);
        int cashier = deQueue();
        //System.out.printf("Cashier: %d\n", cashier);
        System.out.println("Customers in Queue");
        traverseQueue();
    }

    public static void enQueue(int num) {
        if (isFull()) {
            System.out.println("Is Full");
            return;
        }
        queue[++pivot] = num;
    }

    public static int deQueue() {
        if (isEmpty()) {
            System.out.println("Is Empty");
            return 0;
        }
        int valueToReturn = queue[0];
        pivot--;
        shiftQueueLeft();

        return valueToReturn;
    }

    public static void shiftQueueLeft() {
        for (int i = 0; i <= pivot; i++) {
            queue[i] = queue[i+1];
            System.out.printf("i: %d, value: %d\n", i, queue[i]);
        }
    }

    public static boolean isEmpty() {
        return pivot == -1;
    }

    public static boolean isFull() {
        return pivot == queue.length - 1;
    }

    public static void traverseQueue() {

        for (int i = pivot; i >= 0; i--) {
            System.out.println(queue[i] + " ");
        }
    }
}
