package gr.aueb.cf.ch11;

/**
 * Driver class.
 * Creates an instance/object of Student class
 */
public class StudentApp {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student();
        Student chris = new Student();

        Student mark = new Student(4, "Mark", "Z.");
        mark.setId(5);

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("ID: " + alice.getId());
        System.out.println("FIRSTNAME: " + alice.getFirstname());
        System.out.println("LASTNAME: " + alice.getLastname());

        System.out.println("Instances Count: " + Student.getInstancesCount());
    }
}
