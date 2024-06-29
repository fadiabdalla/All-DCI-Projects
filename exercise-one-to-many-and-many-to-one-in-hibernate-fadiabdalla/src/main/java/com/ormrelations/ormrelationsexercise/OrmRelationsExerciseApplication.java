package com.ormrelations.ormrelationsexercise;

import com.ormrelations.ormrelationsexercise.entity.Actor;
import com.ormrelations.ormrelationsexercise.entity.Movie;
import com.ormrelations.ormrelationsexercise.repository.ActorRepo;
import com.ormrelations.ormrelationsexercise.repository.MovieRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrmRelationsExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmRelationsExerciseApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ActorRepo actorRepo, MovieRepo movieRepo){

		return runner -> {

			//createActorsAndMovies(actorRepo,movieRepo);
			//readAllMovies(movieRepo);
			//readAllActors(actorRepo);
			//updateMovie(movieRepo);
			deleteMovie(movieRepo);

		};
	}

	private void deleteMovie(MovieRepo movieRepo) {

		movieRepo.deleteById(1L);
		System.out.println("The Movie with id 1 deleted!");
	}

	private void updateMovie(MovieRepo movieRepo) {

		Movie movie = movieRepo.findById(1L).orElse(null);
		movie.setTitle("Mission Impossible");
		movieRepo.save(movie);
		System.out.println("Movie updated: " + movie);
	}

	private void readAllActors(ActorRepo actorRepo) {

		System.out.println("All Actors: ");

		actorRepo.findAll().forEach(System.out::println);
	}

	private void readAllMovies(MovieRepo movieRepo) {

		System.out.println("All Movies: ");

		movieRepo.findAll().forEach(System.out::println);
	}

	private void createActorsAndMovies(ActorRepo actorRepo,MovieRepo movieRepo) {

		Actor actor1 = new Actor();
		Actor actor2 = new Actor();
		Actor actor3 = new Actor();

		actor1.setname("Tom Cruise");
		actor2.setname("Angelina Jolie");
		actor3.setname("Liam Neeson");

		actorRepo.save(actor1);
		actorRepo.save(actor2);
		actorRepo.save(actor3);

		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		Movie movie3 = new Movie();
		Movie movie4 = new Movie();
		Movie movie5 = new Movie();

		movie1.setTitle("Mission Impossible - Fallout");
		movie1.setGenre("Action");
		movie1.setActor(actor1);

		movie2.setTitle("Top Gun - Maverick");
		movie2.setGenre("Action");
		movie2.setActor(actor1);

		movie3.setTitle("Maleficent");
		movie3.setGenre("Adventure");
		movie3.setActor(actor2);

		movie4.setTitle("Salt");
		movie4.setGenre("Action");
		movie4.setActor(actor2);

		movie5.setTitle("Taken");
		movie5.setGenre("Action");
		movie5.setActor(actor3);

		movieRepo.save(movie1);
		movieRepo.save(movie2);
		movieRepo.save(movie3);
		movieRepo.save(movie4);
		movieRepo.save(movie5);

		System.out.println("3 Actors and 5 Movies added!");

	}
}
