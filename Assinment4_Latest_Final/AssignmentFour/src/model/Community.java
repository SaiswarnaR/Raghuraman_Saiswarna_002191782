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
public class Community {

    private String city;
    private HashMap<String, ArrayList<House>> communityMap;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HashMap<String, ArrayList<House>> getCommunityMap() {
        return communityMap;
    }

    public void setCommunityMap(HashMap<String, ArrayList<House>> communityMap) {
        this.communityMap = communityMap;
    }
}
