package gr.aueb.cf.ch19;

import gr.aueb.cf.ch16.marker.Item;

import java.util.List;

public class GenericApp {

    public static void main(String[] args) {
        GenericNode<Integer> genericNode = new GenericNode<>();
        GenericNode<String> stringGenericNode = new GenericNode<>();
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"Hello", "World"};

        printArray(integers);
        printArray(strings);

    }

    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static void print(GenericNode<? extends Number> node) {
        System.out.println(node.getItem());
    }

    public static <T> void produceConsume(List<? super T> list, Iterable<? extends T> src) {
        for (T t : src) {
            list.add(t);
        }
    }
}
