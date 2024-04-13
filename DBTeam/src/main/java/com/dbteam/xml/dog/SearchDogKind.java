package com.dbteam.xml.dog;

public class SearchDogKind {

    private String value;   //검색어

    //
    public SearchDogKind() {
    }

    public SearchDogKind(String value) {
        this.value = value;
    }

    //
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value;}

    //


    @Override
    public String toString() {
        return "SearchDogKind{" +
                "value='" + value + '\'' +
                '}';
    }

}