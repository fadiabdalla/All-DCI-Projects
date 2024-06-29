package functional_interfaces_and_consumer_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface StringOperation{
	
	String operate(String str);
	
	public static void print (String s) {
		System.out.println(s);
	}
}

@FunctionalInterface
interface DataProcessor{
	
	void process(String data);
}

public class LambdaExercise {
	
	static void processData(List<String> dataList, DataProcessor processor) {
       dataList.forEach((data) -> {
    	   
    	   processor.process(data);
    	   
       });
    }
	

	public static void main(String[] args) {

		List<String> dataList = new ArrayList<>(); 
		
		dataList.add("Fadi");
		dataList.add("Sam");
		dataList.add("John");
		dataList.add("Sarah");
		dataList.add("Mike");
		dataList.add("Paul");
		
		
		StringOperation upperCase = name -> name.toUpperCase();
		DataProcessor processor = name -> {
            String processedData = upperCase.operate(name);
            System.out.println(processedData);
        };
		 processData(dataList,processor); 
		
	}

}
