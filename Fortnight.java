package com.company;


import java.util.ArrayList;

public class Fortnight {
    public static ArrayList<Fortnight> fortnights = new ArrayList<Fortnight>();
    String fortnight_name;
    int citizens;
    int hostile;
    int detected;
    public Fortnight(){

    }
    public Fortnight(String given_fortnight_name, int given_detected, int given_hostiles){
        this.fortnight_name = given_fortnight_name;
        this.detected = given_detected;
        this.hostile = given_hostiles;
        this.citizens = detected - hostile;
        fortnights.add(this);
    }

}
