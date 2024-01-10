package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.MobileContact;

import java.util.ArrayList;
import java.util.List;

public class MobileContactDAOImpl implements IMobileContactDAO {
    private static final List<MobileContact> contacts = new ArrayList<>();


    @Override
    public MobileContact insert(MobileContact mobileContact) {
        contacts.add(mobileContact);
        return mobileContact;
    }

    @Override
    public MobileContact update(MobileContact oldMobileContact, MobileContact newMobileContact) {
        contacts.set(contacts.indexOf(oldMobileContact), newMobileContact);
        return newMobileContact;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public MobileContact get(Long id) {
        return null;
    }

    @Override
    public List<MobileContact> getAll() {
        return null;
    }

    @Override
    public MobileContact get(String phoneNumber) {
        return null;
    }

    @Override
    public boolean phoneNumberExists(String phoneNumber) {
        return false;
    }

    @Override
    public boolean userIdExists(Long id) {
        return false;
    }

    @Override
    public void delete(String phoneNumber) {

    }
}
