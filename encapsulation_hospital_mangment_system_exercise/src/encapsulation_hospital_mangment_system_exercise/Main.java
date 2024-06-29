package encapsulation_hospital_mangment_system_exercise;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Patient patient1 = new Patient("P001", "Samer Wardeh", "1995-11-08");
        Patient patient2 = new Patient("P002", "Maya Barakat", "1993-12-13");

        Doctor doctor1 = new Doctor("D001", "Dr. Kassab", "Cardiologist");
        Doctor doctor2 = new Doctor("D002", "Dr. Meyer", "Pediatrician");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        Appointment appointment1 = new Appointment(patient1, doctor1, "2023-09-10", "10:00 AM");
        Appointment appointment2 = new Appointment(patient2, doctor2, "2023-09-12", "2:30 PM");

        hospital.scheduleAppointment(appointment1);
        hospital.scheduleAppointment(appointment2);

        System.out.println("Patients in the hospital:");
        hospital.displayPatientInfo();

        System.out.println("\nDoctors in the hospital:");
        hospital.displayDoctorInfo();

        System.out.println("\nAppointments in the hospital:");
        for (Appointment appointment : hospital.getAppointments()) {
            appointment.displayAppointmentInfo();
            System.out.println();
        }
    }
}