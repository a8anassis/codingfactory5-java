package gr.aueb.cf.ch20.lambdas;

public class Teacher {
    private int id;
    private String firstname;
    private String lastname;

    public Teacher() {

    }

    public Teacher(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

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

    public void printFullName() {
        System.out.println("Firstname:" + firstname + ", Lastname: " + lastname);
    }

    public static void printTeacher(Teacher teacher) {
        System.out.printf("ID: %d, Firstname: %s, Lastname: %s", teacher.getId(),
                teacher.getFirstname(), teacher.getLastname());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
