package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
    //    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public CoreCompetency() {
//        this.id = nextId;
//        nextId++;
//    }
//
//    public CoreCompetency(String value) {
//        this();
//        this.value = value;
//    }
    public CoreCompetency() {
        super();
    }

    public CoreCompetency(String value) {
        super(value);
    }

// Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return this.getId() == that.getId();
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    //  ONLY a getter for the 'id' field.
//    public int getId() {
//        return id;
//    }
//
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
}
