package voting_system_with_set_exercise;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Set<Candidate> candidates = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		
		
		int choice;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Cast a vote");
			System.out.println("2. Count votes");
			System.out.println("3. Display vote count");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1:
				castVote(candidates, scanner);
				break;
			case 2:
				int count = countVotes(candidates);
				System.out.println("Total votes: " + count);
				break;
			case 3:
				displayVoteCount(candidates);
				break;
			case 4:
				System.out.println("Exiting the program.");
				scanner.close();
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		} while (choice != 4 );
	}

	public static void castVote(Set<Candidate> candidates, Scanner scanner) {
		System.out.print("Enter candidate's name: ");
		String candidateName = scanner.nextLine();

		
		Candidate candidate = findOrCreateCandidate(candidates, candidateName);

		candidate.incrementVoteCount();
		System.out.println("Vote casted for " + candidateName);
	}

	public static int countVotes(Set<Candidate> candidates) {
		int totalCount = 0;
		for (Candidate candidate : candidates) {
			totalCount += candidate.getVoteCount();
		}
		return totalCount;
	}

	public static void displayVoteCount(Set<Candidate> candidates) {
		System.out.println("Vote count for each candidate:");
		for (Candidate candidate : candidates) {
			System.out.println(candidate.getName() + ": " + candidate.getVoteCount() + " votes");
		}
	}

	public static Candidate findOrCreateCandidate(Set<Candidate> candidates, String candidateName) {
		for (Candidate candidate : candidates) {
			if (candidate.getName().equalsIgnoreCase(candidateName)) {
				return candidate;
			}
		}
		Candidate newCandidate = new Candidate(candidateName);
		candidates.add(newCandidate);
		return newCandidate;
	}
}