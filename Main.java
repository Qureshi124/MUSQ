package com.company;

public class Main {

    public static void main(String[] args) {
	new Year(2020, 10000, 5000, 20);
	new Year(2019, 9000, 4500, 30);
	new Year(2018, 8333, 4000, 40);
	new Year(2017, 7000, 3500, 50);
	new Year(2016, 6900, 4000, 60);
	new Year(2015, 6000, 5500, 70);

	new Month("5/2021", 500, 23);
	new Month("4/2021", 496, 33);
	new Month("3/2021", 453, 13);
	new Month("2/2021", 480, 50);
	new Month("1/2021", 390, 3);

	new Fortnight("Fortnight 1", 200, 20);
	new Fortnight("Fortnight 2", 193, 18);
	new Fortnight("Fortnight 3", 180, 17);
	new Fortnight("Fortnight 4", 170, 19);
	new Fortnight("Fortnight 5", 150, 22);

	new Week("Week 1", 70, 5);
	new Week("Week 2", 80, 9);
	new Week("Week 3", 60, 0);
	new Week("Week 4", 63, 3);
	new Week("Week 5", 74, 1);
	new Week("Week 6", 87, 15);

    new Day("10/06/2021", 100, 3);
    new Day("11/06/2021", 90, 2);
    new Day("12/06/2021", 93, 1);
    new Day("13/06/2021", 80, 0);

    System.out.println("/nYears Record");

    System.out.println("Year Name	  Population That Year		Detected		    Citizens		      Hostiles");

    for(Year y : Year.years){
    	System.out.println(y.Year_name + "      		" + y.population_that_year + "      					" + y.detected + "      			" + y.citizens + "      			" +  y.hostile);
    }

    System.out.println("/nMonths Record");

    System.out.println("Month Name		Detected		Citizens		Hostiles");

    for(Month m : Month.months){
		System.out.println(m.month_name + "      	" + m.detected + "      		" + m.citizens + "      			" +  m.hostile);
	}

	System.out.println("/nFortnight Record");

    System.out.println("Fortnight Name		Detected		Citizens		Hostiles");

	for(Fortnight fn : Fortnight.fortnights){
		System.out.println(fn.fortnight_name + "      	" + fn.detected + "      		" + fn.citizens + "      			" +  fn.hostile);
	}

	System.out.println("/nWeeks Record");

	System.out.println("Week Name		Detected		Citizens		Hostiles");

	for(Week w : Week.weeks){
		System.out.println(w.week_name + "      	" + w.detected + "      		" + w.citizens + "      			" +  w.hostile);
	}

	System.out.println("/nDays Record");

	System.out.println("Day Name		Detected		Citizens		Hostiles");

	for(Day d : Day.days){
		System.out.println(d.day_name + "      	" + d.detected + "      		" + d.citizens + "      			" +  d.hostile);
	}

    }
}
