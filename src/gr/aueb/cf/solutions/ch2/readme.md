**Άσκηση 1**

Θέλουμε να αναπτύξουμε ένα πρόγραμμα που να μετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ (Fahrenheit) στην κλίμακα Κελσίου.
Το πρόγραμμα θα εκτυπώνει κατάλληλο μήνυμα και θα διαβάζει στη συνέχεια την ακέραια θερμοκρασία από τον χρήστη
Θα τη μετατρέπει στην κλίμακα Κελσίου σύμφωνα με τον τύπο (5/9)(fahrenheit-32).

Επειδή όλα τα μέλη της παράστασης είναι int το αποτέλεσμα θα είναι int αποκόπτοντας τα δεκαδικά και δε θα είναι ακριβές, αλλά αυτό δε μας πειράζει σε αυτό το στάδιο. 
Προσοχή στον τρόπο που θα δώσετε την παράσταση μετατροπής. Αν δώσετε (5/9)(fahrenheit-32) τότε επειδή 5/9 είναι 0 το τελικό αποτέλεσμα θα είναι 0 (επειδή οι 5 και 9 είναι int, το αποτέλεσμα της διαίρεσης 5/9 θα είναι int δηλ. 0). 

Καλύτερα λοιπόν να δώσουμε την παράσταση ως: 5 * (fahrenheit-32) / 9 που είναι ακριβώς το ίδιο, αλλά αποφεύγουμε το 5/9 που δίνει 0.

**Άσκηση 2**

Γράψτε ένα πρόγραμμα που διαβάζει από τον χρήστη 3 ακέραιους αριθμούς που αναπαριστούν ημέρα, μήνα, έτος και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ
Π.χ. Αν δώσουμε 5 12 2022 θα πρέπει εμφανίσει 05/12/22