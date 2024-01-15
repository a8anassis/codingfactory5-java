package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.MobileContact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        contacts.removeIf(contact -> contact.getId().equals(id));
    }

    @Override
    public MobileContact get(Long id) {
        Optional<MobileContact> contact = contacts.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();

        return contact.orElse(null);
    }

    @Override
    public List<MobileContact> getAll() {
        return new ArrayList<>(contacts);
    }

    @Override
    public MobileContact get(String phoneNumber) {
        Optional<MobileContact> contact = contacts.stream()
                .filter(c -> c.getPhoneNumber().equals(phoneNumber))
                .findFirst();

        return contact.orElse(null);
    }

    @Override
    public boolean phoneNumberExists(String phoneNumber) {
        return contacts.stream()
                .anyMatch(c -> c.getPhoneNumber().equals(phoneNumber));
    }

    @Override
    public boolean userIdExists(Long id) {
        return contacts.stream()
                .anyMatch(c -> c.getId().equals(id));
    }

    @Override
    public void delete(String phoneNumber) {
        contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
    }
}
