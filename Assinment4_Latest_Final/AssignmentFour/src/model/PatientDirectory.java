/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Saiswarna
 */
public class PatientDirectory {

    ArrayList<Patient> patientList;

    public PatientDirectory() {
        if (this.patientList == null || this.patientList.isEmpty()) {
            this.patientList = new ArrayList<>();
        }
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient addPatients() {
        Patient patient = new Patient();
        patientList.add(patient);
        return patient;
    }

}
