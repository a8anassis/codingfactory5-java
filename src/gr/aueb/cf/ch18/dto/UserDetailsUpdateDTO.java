package gr.aueb.cf.ch18.dto;

public class UserDetailsUpdateDTO extends BaseDTO {
    private String firstname;
    private String lastname;

    public UserDetailsUpdateDTO() {

    }

    public UserDetailsUpdateDTO(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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
}
