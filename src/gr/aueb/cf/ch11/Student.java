package gr.aueb.cf.ch11;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Student JavaBean.
 * Data class + default constructor + setters / getters
 */
public class Student {
    private static int instancesCount;
    private int id;
    private String firstname;
    private String lastname;
    private static Scanner in;

    static {
        in = new Scanner(System.in);
        int num = in.nextInt();
        instancesCount = (num == 1) ? 1 : 0;
    }

    // Default Constructor
    public Student() {
        instancesCount++;
    }

    // Overloaded constructor
    public Student(int id, String firstname, String lastname) {
        instancesCount++;
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getInstancesCount() {
        return instancesCount;
    }
}
