package gr.aueb.cf.ch10;

import java.util.ArrayList;

/**
 * Κωδικοποίησε τον 1ο χαρακτήρα του μηνύματος με την ακέραια τιμή που αντιστοιχεί σε αυτόν
 * (από τον κώδικα ASCII). Κωδικοποίησε του επόμενους χαρακτήρες: (α) προσθέτοντας την ακέραια
 * ASCII τιμή του καθένα από αυτούς με τον κωδικό του προηγούμενού του,
 * (β) παίρνοντας το υπόλοιπο της διαίρεσης του αθροίσματος αυτού διά μία σταθερά.
 * Υποθέτουμε πως τα μηνύματα τελειώνουν με τον χαρακτήρα #
 * Γράψτε ένα πρόγραμμα java που να υλοποιεί τον αλγόριθμο κρυπτογράφησης έτσι ώστε το
 * κωδικοποιημένο μήνυμα που προκύπτει να είναι μία ακολουθία ακεραίων που τελειώνει με -1
 * Γράψτε και τον αλγόριθμο αποκρυπτογράφησης που λαμβάνει ως είσοδο μία ακολουθία ακεραίων
 * που τελειώνει με -1 και υπολογίζει το αρχικό μήνυμα
 */
public class CryptoWithMod {

    public static void main(String[] args) {
        // The key should be large enough to give deciphers 0 to 127
        final int KEY = 128;
        String s = "Apollo 17 was the final mission of NASA's Apollo program.#";
        String s1 = encrypt(s, KEY).toString();
        System.out.println(s1);

        String s2 = decrypt(encrypt(s, KEY), KEY).toString();
        System.out.println(s2);
    }

    public static ArrayList<Integer> encrypt(String s, int key) {
        ArrayList<Integer> encrypted = new ArrayList<>();
        char ch;
        int i;

        int prev = cipher(s.charAt(0), -1, key);
        encrypted.add(prev);

        i = 1;
        while ((ch = s.charAt(i)) != '#') {
            encrypted.add(cipher(ch, prev, key));
            prev = cipher(ch, prev, key);
            i++;
        }
        encrypted.add(-1);
        return encrypted;
    }

    public static ArrayList<Character> decrypt(ArrayList<Integer> encrypted, int key) {
        ArrayList<Character> decrypted = new ArrayList<>();
        int token;
        int i;
        int prevToken;

        prevToken = decipher(encrypted.get(0), -1, key);
        decrypted.add((char) prevToken);

        i = 1;
        while ((token = encrypted.get(i)) != -1) {
            decrypted.add(decipher(token, prevToken, key));
            prevToken = token;
            i++;
        }

        return decrypted;
    }

    public static int cipher(char ch, int prev, int key) {
        if (prev == -1) return ch;

        // To cipher θα είναι μεταξύ 0 και (key-1)
        return (ch + prev) % key;
    }

    public static char decipher(int cipher, int prev, int key) {
        int m;

        if (prev == -1) return (char) cipher;

        // Αν cipher-prev είναι αρνητικό θα πρέπει να διορθώσουμε με + key για να
        // πάρουμε θετικό και άρα να τρέξει σωστά το modulo
        m = (cipher - prev + key) % key;
        return (char) m;
    }
}

