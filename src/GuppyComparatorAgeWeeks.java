import java.util.Comparator;

/**
 * Describes a comparator which compares two guppies based on their ages.
 * @author Jianfen Deng ON 2020-10-10
 * @version 1.0
 */
public class GuppyComparatorAgeWeeks implements Comparator<Guppy> {
    /**
     * Compares two guppy objects based on their ages.  Returns a negative integer,
     * zero, or a positive integer as the first argument is younger than, equal
     * to, or older than the second.
     * @param guppy1 the first guppy object to be compared.
     * @param guppy2 the second guppy object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first guppy object is younger than, equal to, or older than the
     * second.
     */
    @Override
    public int compare(final Guppy guppy1, final Guppy guppy2) {
        final int youngerAge = -1;
        final int equalAge = 0;
        final int olderAge = 1;
        int result = equalAge;
        if (guppy1.getAgeInWeeks() < guppy2.getAgeInWeeks()) {
            result = youngerAge;
        } else if (guppy1.getAgeInWeeks() > guppy2.getAgeInWeeks()) {
            result = olderAge;
        }
        return result;
    }
}
