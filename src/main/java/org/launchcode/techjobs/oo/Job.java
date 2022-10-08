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
        String returnString = "\nID: " + this.getId() + "\n";
        if ( name == "") {
            setName(errorString);
        }
        if (employer == null || employer.getValue().equals("")){
            setEmployer(new Employer(errorString));
        }
        if (location == null || location.getValue().equals("")){
            setLocation(new Location(errorString));
        }
        if (positionType == null || positionType.getValue().equals("")){
            setPositionType(new PositionType(errorString));
        }
        if (coreCompetency == null || coreCompetency.getValue().equals("")){
            setCoreCompetency(new CoreCompetency(errorString));
        }

        returnString += "Name: " + this.getName() + "\n";
        returnString += "Employer: " + this.getEmployer() + "\n";
        returnString += "Location: " + this.getLocation() + "\n";
        returnString += "Position Type: " + this.getPositionType() + "\n";
        returnString += "Core Competency: " + this.getCoreCompetency() + "\n";



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
