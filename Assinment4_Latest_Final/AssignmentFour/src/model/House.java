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
public class House {

    private HashMap<String, ArrayList<Person>> houseMap;
    private String community;

    public HashMap<String, ArrayList<Person>> getHouseMap() {
        return houseMap;
    }

    public void setHouseMap(HashMap<String, ArrayList<Person>> houseMap) {
        this.houseMap = houseMap;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

}
