package ch.juventus.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MathUtils {

    final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public double add(List<Double> numbers) {
        double result = 0;
        for (Double num : numbers)
            result += num;
        logger.debug("Ran addition with result{}",result);
        return result;
    }
}

