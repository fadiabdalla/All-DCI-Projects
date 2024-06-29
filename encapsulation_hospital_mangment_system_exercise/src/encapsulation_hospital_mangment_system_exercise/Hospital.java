package encapsulation_hospital_mangment_system_exercise;

import java.util.*;

public class Hospital {
	private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    public Hospital() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        boolean isDuplicate = false;
        for (Patient p : patients) {
            if (p.getPatientId().equals(patient.getPatientId())) {
                isDuplicate = true;
                break;
            }
        }
        
        if (!isDuplicate) {
            patients.add(patient);
        } else {
            System.out.println("Patient ID already exists.");
        }
    }

    public void addDoctor(Doctor doctor) {
        boolean isDuplicate = false;
        for (Doctor d : doctors) {
            if (d.getDoctorId().equals(doctor.getDoctorId())) {
                isDuplicate = true;
                break;
            }
        }
        
        if (!isDuplicate) {
            doctors.add(doctor);
        } else {
            System.out.println("Doctor ID already exists.");
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
