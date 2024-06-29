package data_transformation_sequential_vs_parallel_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Random;

public class NameTransformation {

    private static List<String> sequentialStreamExample(List<String> names) {
        List<String> upperCaseList = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return upperCaseList;
    }

    private static List<String> parallelStreamExample(List<String> names) {
        List<String> upperCaseList = names.parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return upperCaseList;
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Fadi", "Sandy", "Youssef", "Nadia", "Sami", "fadia",
                "alex", "Berna", "joseph", "Joe", "mirna", "reem"));

        // Adding 100 random names to the existing list
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String randomName = generateRandomName(random);
            names.add(randomName);
        }

        long startTimeSequentialStream = System.currentTimeMillis();
        List<String> sequentialStreamList = sequentialStreamExample(names);
        long endTimeSequentialStream = System.currentTimeMillis();
        long sequentialStreamTime = endTimeSequentialStream - startTimeSequentialStream;

        long startTimeParallelStream = System.currentTimeMillis();
        List<String> parallelStreamList = parallelStreamExample(names);
        long endTimeParallelStream = System.currentTimeMillis();
        long parallelStreamTime = endTimeParallelStream - startTimeParallelStream;

        System.out.println("Sequential Stream List: ");
        System.out.println(sequentialStreamList + "\n");
        System.out.println("Time: " + sequentialStreamTime + "ms");

        System.out.println("--------------------------------");

        System.out.println("Parallel Stream List: ");
        System.out.println(parallelStreamList + "\n");
        System.out.println("Time: " + parallelStreamTime + "ms");
    }

    
    private static String generateRandomName(Random random) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        int nameLength = random.nextInt(10) + 3;
        for (int i = 0; i < nameLength; i++) {
            int randomIndex = random.nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }
        return sb.toString();
    }
}
