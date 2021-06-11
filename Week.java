package com.company;


import java.util.ArrayList;

public class Week {
    public static ArrayList<Week> weeks = new ArrayList<Week>();
    String week_name;
    int citizens;
    int hostile;
    int detected;
    public Week(){

    }
    public Week(String given_week_name, int given_detected, int given_hostiles){
        this.week_name = given_week_name;
        this.detected = given_detected;
        this.hostile = given_hostiles;
        this.citizens = detected - hostile;
        weeks.add(this);
    }
}
