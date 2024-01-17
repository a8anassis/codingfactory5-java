package gr.aueb.cf.ch19.cfcollections;

public class StackApp {

    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        intStack.push(6);

        int item = intStack.pop();

        intStack.forEach(System.out::println);
    }
}
