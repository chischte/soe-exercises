package ch.juventus.mathutils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();
    @Test
    public  void addTest(){
    List<Double> testList=new ArrayList<Double>();
    testList.add(1.33);
    testList.add(1.33);
    testList.add(2.33);
    assertEquals(mathUtils.add(testList),4.99,0.001);
    }
}
