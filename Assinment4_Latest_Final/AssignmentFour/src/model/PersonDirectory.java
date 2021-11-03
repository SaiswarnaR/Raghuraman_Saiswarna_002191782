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
public class PersonDirectory {

    private ArrayList<Person> people;

    public PersonDirectory() {
        if (people == null || people.isEmpty()) {
            this.people = new ArrayList<>();
        }
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public Person addPeople() {
        Person person = new Person();
        people.add(person);
        return person;
    }

}
