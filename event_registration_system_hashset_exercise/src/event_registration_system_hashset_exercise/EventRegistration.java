package event_registration_system_hashset_exercise;

import java.util.HashSet;
import java.util.Set;

public class EventRegistration {

	Set<Participant> participants = new HashSet<>();

	public void registerParticipant(String name) {

		participants.add(new Participant(name));

	}

	public void displayParticipants() {

		if (participants.isEmpty()) {
			System.out.println("No participant registered yet.");
		} else {

			System.out.println("The registered participants :");
			for (Participant participant : participants) {

				System.out.println(participant.getName());

			}
		}

	}

}
