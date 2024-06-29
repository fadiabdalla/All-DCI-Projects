package com.crudApllication.crudApplicationExercise.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Column(name = "patient_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")

    private String lastName;

    @Column(name = "address")

    private String address;

    public Patient(){};
    public Patient(String firstName, String lastName, String address){

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient info:" +
                "\npatientId: " + patientId +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAddress: " + address ;
    }
}
