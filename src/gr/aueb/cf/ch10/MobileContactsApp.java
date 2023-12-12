package gr.aueb.cf.ch10;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class MobileContactsApp {

    final static Scanner in = new Scanner(System.in);
    final static String[][] contacts = new String[500][3];
    static int pivot = -1;

    public static void main(String[] args) {

    }



    /*
     *  CRUD Methods - CRUD Layer.
     */

    public static int getContactIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isFull(String[][] contacts) {
        return (pivot == contacts.length - 1);
    }

    public static boolean insertContact(String firstname, String lastname, String phoneNumber) {
        if (isFull(contacts)) return false;
        if (getContactIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }
        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;
        return true;
    }

    public static boolean updateContact(String firstname, String lastname, String phoneNumber) {
        int positionToUpdate = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToUpdate == -1) {
            return false;
        }

        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        return true;
    }

    public static boolean deleteContact(String phoneNumber) {
        int positionToDelete = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToDelete == -1) {
            return false;
        }

        System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        pivot--;
        return true;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int position = getContactIndexByPhoneNumber(phoneNumber);

        return (position == -1) ? new String[] {} : contacts[position];
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);
    }
}
