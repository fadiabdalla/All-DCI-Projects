package hospital_management_system_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
	private int patientId;
	private String patientName;
	private String dateOfBirth;
	private List<Appointment> appointmentLsit = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public Patient(int patientId, String patientName, String dateOfBirth) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.dateOfBirth = dateOfBirth;
	}

	public void getAppointmentLsit() {
		
		for(Appointment ap : appointmentLsit) {
			
			ap.displayAppointmentInfo();
		}
	}

	public void addAppointment() {
		System.out.println("Enter Doctor name : ");
		String doctorName = scanner.next();
		System.out.println("");
		
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void displayPatientInfo() {

		System.out.println("Patient's Info : ");
		System.out.println("Patient ID : " + patientId);
		System.out.println("Patient Name : " + patientName);
		System.out.println("Date of birth : " + dateOfBirth);

	}

}
