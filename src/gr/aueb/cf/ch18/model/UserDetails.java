package gr.aueb.cf.ch18.model;

public class UserDetails extends AbstractEntity {
    private String firstname;
    private String lastname;

    public UserDetails() {

    }

    public UserDetails(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public UserDetails(UserDetails userDetails) {
        this.firstname = userDetails.getFirstname();
        this.lastname = userDetails.getLastname();
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

    @Override
    public String toString() {
        return "UserDetails{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
