package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(MobileContact oldMobileContact, MobileContact newMobileContact);
    void delete(Long id);
    MobileContact get(Long id);
    List<MobileContact> getAll();

    MobileContact get(String phoneNumber);
    boolean phoneNumberExists(String phoneNumber);
    boolean userIdExists(Long id);
    void delete(String phoneNumber);
}
