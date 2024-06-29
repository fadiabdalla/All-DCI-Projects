package type_casting_numeric_operations_exercise;

public class NumericOperations {

	public static void main(String[] args) {

      
        int num1 = 5;
        double num2 = 3.5;
        double result1 = (double) num1 + num2;
        System.out.println("Addition of an int and a double : ");
        System.out.println(num1 + " + " + num2  + " = " + result1 + " (Result number type: double)");
        System.out.println("------------------------------------------------------------");
        System.out.println();
        
        int num3 = 10;
        float num4 = 2.5f;
        float result2 = (float) num3 - num4;
        System.out.println("Subtraction of a float from an int: ");
        System.out.println(num3 + " - " + num4  + " = " + result2 + " (Result number type: float)");
        System.out.println("------------------------------------------------------------");
        System.out.println();

        
        short num5 = 7;
        long num6 = 10000L;
        long result3 = (long) num5 * num6;
        System.out.println("Multiplication of a short and a long : ");
        System.out.println(num5 + " x " + num2  + " = " + result3 + " (Result number type: long)");
        System.out.println("------------------------------------------------------------");
        System.out.println();

        
        double num7 = 15.0;
        double num8 = 2.0;
        double result4 = num7 / num8;
        System.out.println("Division of two double values : ");
        System.out.println(num1 + " ÷ " + num2  + " = " + result4 + " (Result number type:  double)");
    }
}
