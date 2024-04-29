package gr.aueb.cf6.ch6;

/**
 * Stack Impl with Arrays.
 */
public class StackApp_9 {

    static int[] stack = new int[100];
    static int pivot = -1;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        //int num = pop();
        traverseStack();


    }

    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }

        stack[++pivot] = num;
    }

    public static int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }

        return stack[pivot--];
    }

    public static boolean isEmpty() {
        return pivot == -1;
    }

    public static boolean isFull() {
        return pivot == stack.length - 1;
    }

    public static void traverseStack() {
        for (int i = pivot; i >= 0; i--) {
            System.out.println(stack[i] + " ");
        }
    }
}
