package gr.aueb.cf.ch17.clone;

import java.io.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Trainee alice = new Trainee("Alice", new City("Athens"));
        Trainee bob = alice.clone();
        bob.getCity().setDescription("London");
        System.out.println(alice);


//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/tmp/trainee.ser"))) {
//            Trainee alice = new Trainee("Alice", new City("Athens"));
//            oos.writeObject(alice);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
