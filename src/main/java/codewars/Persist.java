package codewars;

/**
 * This method takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 *
 * For example (Input --> Output):
 *
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
 * 4 --> 0 (because 4 is already a one-digit number)
 */
public class Persist {

    public static void main(String[] args) {
        System.out.println(persistence(999));
    }

    public static int persistence(long n) {
        return countPersistence(n, 0);
    }

    public static int countPersistence(long n, int counter){
        if(n < 10 ) return counter;
        long multiplication = 1;

        int[] array = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        for (int i:array){
            multiplication *= i;
        }
        counter++;
        if (multiplication > 9 ) {
           return countPersistence(multiplication,counter);
        }
        return counter;
    }

    public static int persistenceEnhanced(long n) {
        int times = 0;
        while (n >= 10) {
            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            times++;
        }
        return times;
    }

}
