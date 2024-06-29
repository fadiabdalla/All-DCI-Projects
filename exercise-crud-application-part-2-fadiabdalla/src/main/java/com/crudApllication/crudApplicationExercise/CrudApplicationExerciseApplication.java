package com.crudApllication.crudApplicationExercise;

import com.crudApllication.crudApplicationExercise.dao.PatientDAOInterface;
import com.crudApllication.crudApplicationExercise.entity.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudApplicationExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplicationExerciseApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(PatientDAOInterface patientDAO) {

        return runner -> {

            //createPatient(patientDAO);
            //createMultiplePatients(patientDAO);
            //readPatient(patientDAO)
            // readAllPatients(patientDAO);
            //updatePatient(patientDAO);
            // deletePatient(patientDAO);
            deleteALlPatients(patientDAO);


        };

    }

    private void deleteALlPatients(PatientDAOInterface patientDAO) {

        int patientsDeleted = patientDAO.deleteAll();

        System.out.println(patientsDeleted + " Patients were deleted!");

    }

    private void deletePatient(PatientDAOInterface patientDAO) {

        int id = 5;

        patientDAO.delete(id);

        System.out.println("Patient with id " + id + " was deleted!");

    }

    private void updatePatient(PatientDAOInterface patientDAO) {

        int id = 5;
        Patient patient = patientDAO.findById(id);
        patient.setFirstName("Sandy");
        patientDAO.updatePatient(patient);
        System.out.println("Patient Updated!\n" + patient);


    }

    private void readAllPatients(PatientDAOInterface patientDAO) {

        List<Patient> patients = patientDAO.findAll();
        for (Patient patient : patients) {

            System.out.println(patient);

            System.out.println("---------------------------------------");
        }

    }

    private void readPatient(PatientDAOInterface patientDAO) {
        int id = 1;
        System.out.println("Retrieving patient with id " + id);
        Patient patient = patientDAO.findById(id);

        if (patient != null) {
            System.out.println(patient);
        } else {
            System.out.println("Patient not found!");
        }

    }

    private void createMultiplePatients(PatientDAOInterface patientDAO) {

        Patient newPatient1 = new Patient("William", "Holmes", "Hauptstraße 1, 10115 Berlin");
        Patient newPatient2 = new Patient("Emma", "Smith", "Ludwigstraße 55, 30167 Hannover");
        Patient newPatient3 = new Patient("Michael", "Johnson", "Kaiserplatz 2, 53113 Bonn");
        Patient newPatient4 = new Patient("Emily", "Brown", "Marktstraße 10, 20095 Hamburg");
        Patient newPatient5 = new Patient("Jacob", "Davis", "Am Hafen 7, 40221 Düsseldorf");
        Patient newPatient6 = new Patient("Olivia", "Miller", "Schlossallee 15, 14467 Potsdam");
        Patient newPatient7 = new Patient("Daniel", "Wilson", "Bahnhofplatz 1, 90443 Nürnberg");
        Patient newPatient8 = new Patient("Sophia", "Taylor", "Friedrichstraße 22, 10117 Berlin");
        Patient newPatient9 = new Patient("Matthew", "Anderson", "Hafenstraße 25, 27568 Bremerhaven");
        Patient newPatient10 = new Patient("Charlotte", "Martinez", "Domplatz 20, 04109 Leipzig");

        patientDAO.save(newPatient1);
        patientDAO.save(newPatient2);
        patientDAO.save(newPatient3);
        patientDAO.save(newPatient4);
        patientDAO.save(newPatient5);
        patientDAO.save(newPatient6);
        patientDAO.save(newPatient7);
        patientDAO.save(newPatient8);
        patientDAO.save(newPatient9);
        patientDAO.save(newPatient10);

        System.out.println("10 Patients added!");


    }

    private void createPatient(PatientDAOInterface patientDAO) {

        Patient patient = new Patient("Fadi", "Georgos", "Steintor 125, 28223 Bremen");

        System.out.println("Saving new Patiant...");

        patientDAO.save(patient);

        System.out.println("Patient added!");

    }

    ;

}
