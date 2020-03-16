package ch.juventus.collections;

import java.util.List;

public class MathUtils {
    public double add(List<Double> numbers) {
        double result = 0;
        for (Double num : numbers)
            result += num;
        return result;
    }
}
