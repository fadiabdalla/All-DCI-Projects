package movie_rating_system_hashset_exercise;

import java.util.HashSet;
import java.util.Set;

public class RatingSystem {

	Set<MovieRating> movieRatings = new HashSet<>();

	public void addRating(String movieTitle, double rating) {


		movieRatings.add(new MovieRating(movieTitle, rating));

	}
	
	
	public void displayRatings() {
        System.out.println("Unique Movie Ratings: ");
        for (MovieRating rating : movieRatings) {
            System.out.println("Movie: " + rating.getMovieTitle() + " | Rating: " + rating.getRating());
        }
    }

}
