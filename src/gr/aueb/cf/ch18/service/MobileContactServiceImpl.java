package gr.aueb.cf.ch18.service;

import gr.aueb.cf.ch18.dao.IMobileContactDAO;
import gr.aueb.cf.ch18.dto.MobileContactInsertDTO;
import gr.aueb.cf.ch18.dto.MobileContactUpdateDTO;
import gr.aueb.cf.ch18.dto.UserDetailsInsertDTO;
import gr.aueb.cf.ch18.dto.UserDetailsUpdateDTO;
import gr.aueb.cf.ch18.model.MobileContact;
import gr.aueb.cf.ch18.model.UserDetails;
import gr.aueb.cf.ch18.service.exceptions.ContactNotFoundException;
import gr.aueb.cf.ch18.service.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public class MobileContactServiceImpl implements IMobileContactService {
    private final IMobileContactDAO dao;

    public MobileContactServiceImpl(IMobileContactDAO dao) {
        this.dao = dao;
    }

    @Override
    public MobileContact insertMobileContact(MobileContactInsertDTO mobileContactInsertDTO)
            throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException {
        MobileContact mobileContact;

        try {
            mobileContact = mapFromInsertDTO(mobileContactInsertDTO);

            if (dao.phoneNumberExists(mobileContact.getPhoneNumber())) {
                throw new PhoneNumberAlreadyExistsException(mobileContact);
            }

            if (dao.userIdExists(mobileContact.getId())) {
                throw new UserIdAlreadyExistsException(mobileContact);
            }

            return dao.insert(mobileContact);
        } catch (PhoneNumberAlreadyExistsException | UserIdAlreadyExistsException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public MobileContact updateMobileContact(MobileContactUpdateDTO oldDTO, MobileContactUpdateDTO newDTO)
            throws ContactNotFoundException, PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException {
        MobileContact oldMobileContact;
        MobileContact newMobileContact;

        try {
            oldMobileContact = mapFromUpdateDTO(oldDTO);
            newMobileContact = mapFromUpdateDTO(newDTO);

            if (!dao.userIdExists(oldMobileContact.getId())) {
                throw new ContactNotFoundException(oldMobileContact.getId());
            }
            if (dao.phoneNumberExists(newMobileContact.getPhoneNumber())) {
                throw new PhoneNumberAlreadyExistsException(newMobileContact);
            }
            if (dao.userIdExists(newMobileContact.getId())) {
                throw new UserIdAlreadyExistsException(newMobileContact);
            }
            return dao.update(oldMobileContact, newMobileContact);
        } catch (ContactNotFoundException | PhoneNumberAlreadyExistsException | UserIdAlreadyExistsException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteMobileContactById(Long id) throws ContactNotFoundException {
        try {
            if (!dao.userIdExists(id)) {
                throw new ContactNotFoundException(id);
            }
            dao.delete(id);
        } catch (ContactNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public MobileContact getMobileContactById(Long id) throws ContactNotFoundException {
        MobileContact mobileContact;

        try {
            mobileContact = dao.get(id);
            if (mobileContact == null) {
                throw new ContactNotFoundException(id);
            }
            return mobileContact;
        } catch (ContactNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<MobileContact> getAllMobileContacts() {
        return dao.getAll();
    }

    @Override
    public MobileContact getMobileContactByPhoneNumber(String phoneNumber)
            throws ContactNotFoundException {
        MobileContact mobileContact;

        try {
            mobileContact = dao.get(phoneNumber);
            if (mobileContact == null) {
                throw new ContactNotFoundException(phoneNumber);
            }
            return mobileContact;
        } catch (ContactNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteMobileContactByPhoneNumber(String phoneNumber)
            throws ContactNotFoundException {
        try {
            if (!dao.phoneNumberExists(phoneNumber)) {
                throw new ContactNotFoundException(phoneNumber);
            }
            dao.delete(phoneNumber);
        } catch (ContactNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private UserDetails mapFromInsertDTO(UserDetailsInsertDTO userDetailsInsertDTO) {
        return new UserDetails(userDetailsInsertDTO.getId(), userDetailsInsertDTO.getFirstname(), userDetailsInsertDTO.getLastname());
    }

    private UserDetails mapFromUpdateDTO(UserDetailsUpdateDTO userDetailsUpdateDTO) {
        return new UserDetails(userDetailsUpdateDTO.getId(), userDetailsUpdateDTO.getFirstname(), userDetailsUpdateDTO.getLastname());
    }

    private MobileContact mapFromInsertDTO(MobileContactInsertDTO mobileContactInsertDTO) {
        UserDetails userDetails = mapFromInsertDTO(mobileContactInsertDTO.getUserDetailsInsertDTO());
        return new MobileContact(userDetails, mobileContactInsertDTO.getPhoneNumber());
    }

    private MobileContact mapFromUpdateDTO(MobileContactUpdateDTO mobileContactUpdateDTO) {
        UserDetails userDetails = mapFromUpdateDTO(mobileContactUpdateDTO.getUserDetailsUpdateDTO());
        return new MobileContact(userDetails, mobileContactUpdateDTO.getPhoneNumber());
    }

}
