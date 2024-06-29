package hospital_management_system_exercise;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private int doctorId;
	private String doctorName;
	private String specialization;
	private List<Appointment> appointmentLsit = new ArrayList<>();	
	public Doctor(int doctorId, String doctorName, String specialization) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
public void displayDoctorInfo() {
		
		System.out.println("Doctor's Info : ");
		System.out.println("Doctor ID : " + doctorId);
		System.out.println("Doctor Name : " + doctorName);
		System.out.println("Specialization  : " + specialization);
		
		
	}

}
