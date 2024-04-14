package com.dbteam.xml.adoption;

public class SearchAdoptionName {


    private String value;

    public SearchAdoptionName() {
    }

    public SearchAdoptionName(String value) {
        this.value = value;
    }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }


    @Override
    public String toString() {
        return "SearchAdoptionName{" +
                "value='" + value + '\'' +
                '}';
    }
}


