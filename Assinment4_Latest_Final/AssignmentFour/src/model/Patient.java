/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Saiswarna
 */
public class Patient {

    private EncounterHistory encounterHistory;
    private Person person;
    private boolean isAbnormal;

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(boolean isAbnormal) {
        this.isAbnormal = isAbnormal;
    }

}
