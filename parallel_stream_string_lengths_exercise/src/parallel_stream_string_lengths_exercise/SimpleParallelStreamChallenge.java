package parallel_stream_string_lengths_exercise;

import java.util.Arrays;
import java.util.List;

public class SimpleParallelStreamChallenge {

    private static List<Integer> parallelStringLengths(List<String> words) {
        return words.parallelStream()
                .map(String::length)
                .toList();
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("Java", "Stream", "Challenge", "Parallel", "Processing", "Example","dfadsfa","ahfaiusiugfliugagflugfas","jvjafsjfsjgaakubsgligdlgiaus");

        System.out.println("Original List: " + wordList);

        List<Integer> lengths = parallelStringLengths(wordList);

        System.out.println("Lengths: " + lengths);
    }
}
