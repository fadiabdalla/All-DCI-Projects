package hospital_management_system_exercise;

public class Appointment {
	private Patient patient;
	private Doctor doctor;
	private String date;
	private String time;
	public Appointment(Patient patient, Doctor doctor, String date, String time) {
		super();
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
		this.time = time;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public void displayAppointmentInfo() {
		
		System.out.println("Appointment info : ");
		System.out.println("Patient's ID : " + patient.getPatientId());
		System.out.println("Patient's Name : " + patient.getPatientName());
		System.out.println("Doctor's ID : " + doctor.getDoctorId());
		System.out.println("Doctor's Name : " + doctor.getDoctorName());
		System.out.println("Date : " + date);
		System.out.println("Time : " + time);
		
		
		
	}
	

}
