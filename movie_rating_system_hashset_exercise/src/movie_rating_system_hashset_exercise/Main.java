package movie_rating_system_hashset_exercise;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RatingSystem ratingSystem = new RatingSystem();

        System.out.println("Movie Rating System");
        while (true) {
            System.out.println("Enter a movie title (or 'exit' to stop):");
            String movieTitle = scanner.nextLine();
            
            if (movieTitle.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the rating for '" + movieTitle + "':");
            Double rating = scanner.nextDouble();
            scanner.nextLine();

            ratingSystem.addRating(movieTitle, rating);
        }

        ratingSystem.displayRatings();
    }
}

