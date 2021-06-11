package com.company;


import java.util.ArrayList;

public class Month {
    public static ArrayList<Month> months = new ArrayList<Month>();
    String month_name;
    int citizens;
    int hostile;
    int detected;
    public Month(){

    }
    public Month(String given_month_name, int given_detected, int given_hostiles){
        this.month_name = given_month_name;
        this.detected = given_detected;
        this.hostile = given_hostiles;
        this.citizens = detected - hostile;
        months.add(this);
    }

}
