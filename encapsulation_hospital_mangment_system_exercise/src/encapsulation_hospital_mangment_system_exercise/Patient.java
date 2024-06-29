package encapsulation_hospital_mangment_system_exercise;

public class Patient {
	private String patientId;
	private String patientName;
	private String dateOfBirth;
	
	
	
	public Patient(String patientId, String patientName, String dateOfBirth) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
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
