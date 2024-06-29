package autoboxing_and_unboxing_list_of_integers_exercise;

import java.util.ArrayList;

public class IntegerList {
    public static void main(String[] args) {
    	
        ArrayList<Integer> integerList = new ArrayList<>();

        int a = 5;
        Integer b = 10;
        integerList.add(a);
        integerList.add(b);

        int firstElement = integerList.get(0);
        Integer secondElement = integerList.get(1);
        System.out.println("First element using primitive data type: " + firstElement);
        System.out.println("Second element using wrapper class: " + secondElement);

        int sum = firstElement + secondElement;
        System.out.println("Sum of the integers: " + sum);
    }
}