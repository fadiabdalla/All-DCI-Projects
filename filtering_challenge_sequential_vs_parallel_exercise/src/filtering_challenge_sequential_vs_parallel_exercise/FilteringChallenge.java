package filtering_challenge_sequential_vs_parallel_exercise;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilteringChallenge {

	 private static List<Integer> sequentialFilterExample(List<Integer> numbers, Predicate<Integer> isEven) {
	        return numbers.stream()
	                .filter(isEven)
	                .collect(Collectors.toList());
	    }

	    private static List<Integer> parallelFilterExample(List<Integer> numbers, Predicate<Integer> isEven) {
	        return numbers.parallelStream()
	                .filter(isEven)
	                .collect(Collectors.toList());
	    }
	
	public static void main(String[] args) {

		
		 Predicate<Integer> isEven = n -> n % 2 == 0;
	
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16 );
		
		long startTimeSequentialStream = System.currentTimeMillis();
		
        List<Integer> sequentialStreamList = sequentialFilterExample(numbers,isEven);
        
        long endTimeSequentialStream = System.currentTimeMillis();
        
        long sequentialStreamTime = endTimeSequentialStream - startTimeSequentialStream;
        
        

        long startTimeParallelStream = System.currentTimeMillis();
        
        List<Integer> parallelStreamList = parallelFilterExample(numbers,isEven);
        
        long endTimeParallelStream = System.currentTimeMillis();
        
        long parallelStreamTime = endTimeParallelStream - startTimeParallelStream;
        
        
        
		System.out.println("Sequential Stream List: ");
		System.out.println(sequentialStreamList + "\n");
		System.out.println("Time: " + sequentialStreamTime +"ms");
		
		System.out.println("--------------------------------");
		
		System.out.println("Parallel Stream List: ");
		System.out.println(parallelStreamList + "\n");
		System.out.println("Time: " + parallelStreamTime +"ms");
		
		
	}

}