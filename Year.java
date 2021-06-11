package com.company;


import java.util.ArrayList;

public class Year {
    public static ArrayList<Year> years = new ArrayList<Year>();
    int Year_name;
    int population_that_year;
    int citizens;
    int hostile;
    int detected;
    public Year(){

    }
    public Year(int given_year_name, int given_population_that_year, int given_detected, int given_hostiles){
        this.Year_name = given_year_name;
        this.population_that_year = given_population_that_year;
        this.detected = given_detected;
        this.hostile = given_hostiles;
        this.citizens = detected - hostile;
        years.add(this);
    }
}
