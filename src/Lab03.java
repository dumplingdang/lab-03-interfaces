import java.util.Arrays;
import java.util.Comparator;

/**
 * Driver to sort a group of guppies by their ids, health coefficients and ages.
 * @author Jianfen Deng ON 2020-10-09
 * @version 1.0
 */
public final class Lab03 {
    /*
    Sets the constructor private to avoid being instantiated.
     */
    private Lab03() { }
    /***
     * Entry point of an application to test the sorting of a group of guppies based on their ids.
     * @param args An array of command-line arguments for the application.
     */
    public static void main(final String[] args) {
        final int    sizeOfAGroupOfGuppies             = 100;
        Guppy[]      guppies                           = new Guppy[sizeOfAGroupOfGuppies];
        //Fills each array cell with a guppy object.
        for (int i = 0; i < sizeOfAGroupOfGuppies; i++) {
            guppies[i] = new Guppy();
            guppies[i].setHealthCoefficient(Math.sqrt(Guppy.DEFAULT_HEALTH_COEFFICIENT / i));
            guppies[i].setAgeInWeeks(i);
            if (i > Guppy.MAXIMUM_AGE_IN_WEEKS) {
                guppies[i].setAgeInWeeks(i - Guppy.MAXIMUM_AGE_IN_WEEKS);
            }
        }
        //Sorts guppies by id from larger to smaller.
        Arrays.sort(guppies);
        for (int i = 0; i < sizeOfAGroupOfGuppies; i++) {
            System.out.println(
                    "Guppy #" + (i + 1) + " has " + "id #" + guppies[i].getIdentificationNumber());
        }
        //Sorts guppies by health coefficient from higher to lower.
        Comparator<Guppy>    comparator = new GuppyComparatorHealthCoefficient();
        Arrays.sort(guppies, comparator);
        for (int i = 0; i < sizeOfAGroupOfGuppies; i++) {
            System.out.println(
                    "Guppy #" + (i + 1) + " has health coefficient "
                    + guppies[i].getHealthCoefficient());
        }
        //Sorts guppies by age from younger to older.
        comparator = new GuppyComparatorAgeWeeks();
        Arrays.sort(guppies, comparator);
        for (int i = 0; i < sizeOfAGroupOfGuppies; i++) {
            System.out.println(
                    "Guppy #" + (i + 1) + " is " + guppies[i].getAgeInWeeks() + " weeks old");
        }
    }
}

