package gr.aueb.cf.ch10;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Έστω ένας δισδιάστατος πίνακας που περιέχει τα στοιχεία άφιξης και αναχώρησης αυτοκινήτων
 * σε μορφή arr[][] = {{1012, 1136}, {1317, 1417}, {1015, 1020}}.  Αναπτύξτε μία εφαρμογή που
 * διαβάζει να εκτυπώνει τον μέγιστο αριθμό αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα.
 * Ως παράδειγμα στον παραπάνω πίνακα το αποτέλεσμα θα πρέπει να είναι: 2. Το 1ο αυτοκίνητο αφίχθη στις
 * 10:12 και αναχώρησε στις 11:36, το 3ο αυτοκίνητο αφίχθη στις 10:15 και αναχώρησε στις 10:20.
 * Επομένως, το 1ο και το 3ο αυτοκίνητο ήταν παρόντα το ίδιο χρονικό διάστημα.
 *
 * Hint. Με βάση τον αρχικό πίνακα, δημιουργήστε ένα δυσδιάστατο πίνακα που σε κάθε γραμμή θα περιέχει
 * δύο πεδία int. Στο πρώτο πεδίο θα εισάγεται η ώρα άφιξης ή αναχώρησης από τον αρχικό πίνακα και στο
 * 2ο πεδίο θα εισάγεται ο αριθμός 1 αν πρόκειται για άφιξη και 0 αν πρόκειται για αναχώρηση.
 * Ταξινομήστε τον πίνακα σε αύξουσα σειρά με βάση την ώρα. Στη συνέχεια υπολογίστε το μέγιστο αριθμό
 * αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα με ένα πέρασμα του πίνακα.
 */
public class MaxCarsApp {

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1012, 1136}, {1022, 1126}, {1317, 1417}, {1015, 1025}};
        int[][] transformed;

        transformed = transformArray(arr);
        sortByTime(transformed);

        for (int[] row : transformed) {
            System.out.print(row[0] + " ");
            System.out.println(row[1]);
        }

        //System.out.println("max: " + getMaxOnes(transformed));
        System.out.println("Max Concurrent Cars: " + getMaxConcurrentCars(transformed));
    }

    /**
     * Transforms the initial 2D array with one-row departures and arrivals
     * into a x2 2D array; one row for departure and one row for arrival.
     * The second column involves 1 for arrival and 0 for departure.
     *
     * @param arr   the source array
     * @return      the transformed array
     */
    public static int[][] transformArray(int[][] arr) {
        int[][] transformed = new int[arr.length*2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transformed[i*2][0] = arr[i][0];
                transformed[i*2][1] = 1;
                transformed[i*2+1][0] = arr[i][1];
                transformed[i*2+1][1] = 0;
            }
        }

        return transformed;
    }


    /**
     * Sorts the transformed array in ascending order
     * by the time of car arrival or departure. It uses
     * a Comparator for sorting the first column.
     *
     * @param arr   the source transformed array
     */
    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));
    }

    /**
     * It counts the max 1s (arrivals) that are continuous.
     *
     * @param arr   the transformed array
     * @return      the max number of arrivals in a time
     *              interval
     */
    public static int getMaxOnes(int[][] arr) {
        int times = 0;
        int maxTimes = 0;
        int i = 0;

       while (i < arr.length) {
            times = 0;

            while ((i < arr.length) && (arr[i++][1] == 1)) {
                times++;
            }

            if (times > maxTimes) maxTimes = times;
        }

        return maxTimes;
    }

    /**
     * Returns the number of cars that are parked
     * during the same time interval.
     *
     * @param arr   the source array with arrivals and departures
     * @return      the concurrently parked cars
     */
    public static int getMaxConcurrentCars(int[][] arr) {
        int count = 0;
        int maxCount = 0;

        for (int[] ints : arr) {
            if (ints[1] == 1){
                count++;
                if (count > maxCount) maxCount = count;
            }
            else count--;
        }

        return maxCount;
    }
}
