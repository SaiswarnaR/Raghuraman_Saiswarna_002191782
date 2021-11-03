/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Saiswarna
 */
public class EncounterHistory {

    int id;
    ArrayList<Encounter> encounterHistory;
    private HashMap<Integer, ArrayList<Encounter>> encounterHistoryMap;

    public EncounterHistory() {
        if (this.encounterHistory == null || this.encounterHistory.isEmpty()) {
            encounterHistory = new ArrayList<>();
        }
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, ArrayList<Encounter>> getEncounterHistoryMap() {
        return encounterHistoryMap;
    }

    public void setEncounterHistoryMap(HashMap<Integer, ArrayList<Encounter>> encounterHistoryMap) {
        this.encounterHistoryMap = encounterHistoryMap;
    }
}
