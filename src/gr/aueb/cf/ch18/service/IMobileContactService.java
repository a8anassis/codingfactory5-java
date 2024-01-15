package gr.aueb.cf.ch18.service;

import gr.aueb.cf.ch18.dto.MobileContactInsertDTO;
import gr.aueb.cf.ch18.dto.MobileContactUpdateDTO;
import gr.aueb.cf.ch18.model.MobileContact;
import gr.aueb.cf.ch18.service.exceptions.ContactNotFoundException;
import gr.aueb.cf.ch18.service.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public interface IMobileContactService {
    MobileContact insertMobileContact(MobileContactInsertDTO mobileContactInsertDTO)
        throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    MobileContact updateMobileContact(MobileContactUpdateDTO oldDTO, MobileContactUpdateDTO newDTO)
        throws ContactNotFoundException, PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    void deleteMobileContactById(Long id) throws ContactNotFoundException;
    MobileContact getMobileContactById(Long id) throws ContactNotFoundException;
    List<MobileContact> getAllMobileContacts();

    MobileContact getMobileContactByPhoneNumber(String phoneNumber) throws ContactNotFoundException;
    void deleteMobileContactByPhoneNumber(String phoneNumber) throws ContactNotFoundException;
}
