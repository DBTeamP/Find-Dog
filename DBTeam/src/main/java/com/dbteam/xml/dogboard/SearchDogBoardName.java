package com.dbteam.xml.dogboard;

public class SearchDogBoardName {

    private String value;   //검색어

    //
    public SearchDogBoardName() {
    }

    //
    public SearchDogBoardName(String value) {
        this.value = value;
    }

    //
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    //


    @Override
    public String toString() {
        return "SearchDogBoardName{" +
                "value='" + value + '\'' +
                '}';
    }

}
