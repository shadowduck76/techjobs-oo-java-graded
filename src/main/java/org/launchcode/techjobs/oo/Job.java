package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job () {
        id = nextId;
        nextId++;
    }

    public Job (String aName, Employer anEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = anEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public String toString() {
        String errorString = "Data not available";
        String returnString = "\n";
        returnString += "ID: " + this.getId() + "\n";
        if (this.getName() == null) {
            returnString += "Name: "+ errorString + "\n";
        } else {
            returnString += "Name: " + this.getName() + "\n";
        }
        if (this.getEmployer() == null){
            returnString += "Employer: "+ errorString +"\n";
        } else {
            returnString += "Employer: " + this.getEmployer() + "\n";
        }
        if (this.getLocation() == null){
            returnString += "Location: "+ errorString +"\n";
        } else {
            returnString += "Location: " + this.getLocation() + "\n";
        }
        if (this.getPositionType() == null){
            returnString += "Position Type: "+ errorString +"\n";
        } else {
            returnString += "Position Type: " + this.getPositionType() + "\n";
        }
        if (this.getCoreCompetency() == null){
            returnString += "Core Competency: "+ errorString +"\n";
        } else {
            returnString += "Core Competency: " + this.getCoreCompetency() + "\n";
        }



        return returnString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
