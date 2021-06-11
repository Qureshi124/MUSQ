package com.company;


import java.util.ArrayList;

public class Day {
    public static ArrayList<Day> days = new ArrayList<Day>();
    String day_name;
    int citizens;
    int hostile;
    int detected;
    public Day(){

    }
    public Day(String given_day_name, int given_detected, int given_hostiles){
        this.day_name = given_day_name;
        this.detected = given_detected;
        this.hostile = given_hostiles;
        this.citizens = detected - hostile;
        days.add(this);
    }
}
