package Homework;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private Date birthDate;
    private Map<Person, String> personRelationships;
    private Map<Company, String> companyRelationships;
    private String occupation;

    public Person( String name, Date birthDate, String occupation){
    this.name = name;
    this.birthDate = birthDate;
    this.personRelationships = new HashMap<>();
    this.companyRelationships = new HashMap<>();
    this.occupation = occupation;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Map<Person, String> getPersonRelationships() {
        return personRelationships;
    }

    public void setPersonRelationships(Map<Person, String> personRelationships) {
        this.personRelationships = personRelationships;
    }

    public Map<Company, String> getCompanyRelationships() {
        return companyRelationships;
    }

    public void setCompanyRelationships(Map<Company, String> companyRelationships) {
        this.companyRelationships = companyRelationships;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void addPersonRelationship(Person person, String relationship) {
        personRelationships.put(person, relationship);
    }

    public void addCompanyRelationship(Company company, String position) {
        companyRelationships.put(company, position);
    }

    public int getNumberOfConnections(){
        return personRelationships.size() + companyRelationships.size();
    }
}
