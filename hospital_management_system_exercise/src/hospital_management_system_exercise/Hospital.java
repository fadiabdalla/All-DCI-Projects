package hospital_management_system_exercise;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
	private HashMap<Integer,Patient> patients;
    private HashMap<Integer,Doctor> doctors;
    private HashMap<Integer,Appointment> appointments;

    public Hospital() {
        patients = new HashMap<>();
        doctors = new HashMap<>();
        appointments = new HashMap<>();
    }

    public void addPatient(Patient patient) {
        boolean isDuplicate = false;
        for (Patient p : patients.values()) {
            if (p.getPatientName().equals(patient.getPatientName())) {
                isDuplicate = true;
                break;
            }
        }
        
        if (!isDuplicate) {
            patients.put(patient.getPatientId(), patient);
        } else {
            System.out.println("Patient already exists.");
        }
    }

    public void addDoctor(Doctor doctor) {
        boolean isDuplicate = false;
        for (Doctor d : doctors.values()) {
            if (d.getDoctorName().equals(doctor.getDoctorName())) {
                isDuplicate = true;
                break;
            }
        }
        
        if (!isDuplicate) {
            doctors.put(doctor.getDoctorId(),doctor);
        } else {
            System.out.println("Doctor already exists.");
        }
    }

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void displayPatientInfo() {
        for (Patient patient : patients) {
            patient.displayPatientInfo();
            System.out.println();
        }
    }

    public void displayDoctorInfo() {
        for (Doctor doctor : doctors) {
            doctor.displayDoctorInfo();
            System.out.println();
        }
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
}