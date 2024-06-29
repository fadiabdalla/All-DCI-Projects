package encapsulation_hospital_mangment_system_exercise;

public class Doctor {
	private String doctorId;
	private String doctorName;
	private String specialization;
	public Doctor(String doctorId, String doctorName, String specialization) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
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
