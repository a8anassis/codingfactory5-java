package gr.aueb.cf.ch18.dto;

public class MobileContactUpdateDTO extends BaseDTO {
    private UserDetailsInsertDTO userDetailsInsertDTO;
    private String phoneNumber;

    public MobileContactUpdateDTO() {

    }

    public MobileContactUpdateDTO(UserDetailsInsertDTO userDetailsInsertDTO, String phoneNumber) {
        this.userDetailsInsertDTO = userDetailsInsertDTO;
        this.phoneNumber = phoneNumber;
    }

    public UserDetailsInsertDTO getUserDetailsInsertDTO() {
        return userDetailsInsertDTO;
    }

    public void setUserDetailsInsertDTO(UserDetailsInsertDTO userDetailsInsertDTO) {
        this.userDetailsInsertDTO = userDetailsInsertDTO;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
