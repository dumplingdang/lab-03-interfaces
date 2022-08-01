import java.util.Comparator;

/**
 * Describes a comparator which compares two guppies based on their health coefficient.
 * @author Jianfen Deng ON 2020-10-10
 * @version 1.0
 */
public class GuppyComparatorHealthCoefficient implements Comparator<Guppy> {
    /**
     * Compares two guppies based on their health coefficients.  Returns a negative integer,
     * zero, or a positive integer as the first guppy's health coefficient is higher than, equal
     * to, or lower than the second.
     * @param guppy1 the first guppy object to be compared.
     * @param guppy2 the second guppy object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first guppy is higher than, equal to, or lower than the
     * second.
     */
    @Override
    public int compare(final Guppy guppy1, final Guppy guppy2) {
        final int equalHealthCoefficient  = 0;
        final int higherHealthCoefficient = -1;
        final int lowerHealthCoefficient  = 1;
        int       result                  = equalHealthCoefficient;
        if (guppy1.getHealthCoefficient() < guppy2.getHealthCoefficient()) {
            result = lowerHealthCoefficient;
        } else if (guppy1.getHealthCoefficient() > guppy2.getHealthCoefficient()) {
            result = higherHealthCoefficient;
        }
        return result;
    }
}
