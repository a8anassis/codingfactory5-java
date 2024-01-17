package gr.aueb.cf.ch19.cfcollections;

import java.util.HashSet;
import java.util.Set;

public class SetApp {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();
        bag.add("Apples");
        bag.add("Oranges");
        bag.remove("Apples");
        bag.add("Oranges");

        bag.forEach(System.out::println);
    }
}
