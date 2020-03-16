package ch.juventus.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        MathUtils mathUtils = new MathUtils();

        List<Double> additionList=new ArrayList<Double>();
        additionList.add(1.44);
        additionList.add(1.22);
        additionList.add(1.11);
        double result=mathUtils.add(additionList);
        System.out.println(result);
    }
}
