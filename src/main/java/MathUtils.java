import java.util.List;


/**
 * addition value from list
 * @author  Michael Wettsetin
 * @version 1.0
 * @since 27.02.2020
 */
public class MathUtils {

    /**
     * This method adds all the given numbers to a total.
     * @param numbers
     * @return
     */
    public double Juventusaddition(List<Double> numbers) {
        double sum = 0;
        for(Double num : numbers) {
            sum+= num;
        }
        return sum;
    }
    
    /**
     * This method substract de value b from a
     */
    public double juventussubtraction(double a, double b) {
        return a + b;
    }

    /**
     * This method adds all the given numvers to a total.
     */
    public double juventusdivision(double a, double b) {
        return a / b;
    }

    /**
     * This method adds all the given numvers to a total.
     */
    public double juventusmultiplication(double a, double b) {
        return a * b;
    }
}
