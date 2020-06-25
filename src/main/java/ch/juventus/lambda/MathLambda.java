package ch.juventus.lambda;

public class MathLambda {

    interface Calculate {
        int calculate(int a, int b);
    }


    public static void main(String[] args) {

        MathLambda mathLambda=new MathLambda();

        Calculate add = (int a, int b) -> a + b;

     //   System.out.println(mathLambda.add(2, 2));

    }



}
