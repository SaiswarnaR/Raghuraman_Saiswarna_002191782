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
public class City {

    private ArrayList<Community> communities;
    private System system;
    private String city;
    private HashMap<String, ArrayList<Community>> cityMap;

    public City() {
        if (this.communities == null || this.communities.isEmpty()) {
            this.communities = new ArrayList<>();
        }
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public void addCommunity(Community community) {
        communities.add(community);
    }

    public ArrayList<Community> getAllCommunities() {
        return communities;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HashMap<String, ArrayList<Community>> getCityMap() {
        return cityMap;
    }

    public void setCityMap(HashMap<String, ArrayList<Community>> cityMap) {
        this.cityMap = cityMap;
    }

}
