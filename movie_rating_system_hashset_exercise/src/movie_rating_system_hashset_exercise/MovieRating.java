package movie_rating_system_hashset_exercise;

import java.util.Objects;

public class MovieRating {
	
	private String movieTitle;
	private double rating;
	
	public MovieRating(String movieTitle, double rating) {
		
		this.movieTitle = movieTitle;
		this.rating = rating;
		
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieRating other = (MovieRating) obj;
		return Objects.equals(movieTitle, other.movieTitle);
	}

	
	
	
	
	

}
