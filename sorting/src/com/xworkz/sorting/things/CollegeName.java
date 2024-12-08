package com.xworkz.sorting.things;

import java.io.Serializable;

public class CollegeName implements Serializable {

    public String collegeName;


    public CollegeName(String collegeName) {
        this.collegeName = collegeName;


    }


    @Override
    public String toString() {
        return "CollegeName{" +
                "collegeName='" + collegeName + '\'' +
                '}';
    }
}
