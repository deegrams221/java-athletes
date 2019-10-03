package com.lambdaschool.solution;

public class MyAthlete implements Processor
{
    private AthleteService athleteSvc;
    
    public MyAthlete(AthleteService athleteSvc)
    {
        this.athleteSvc = athleteSvc;
    }

    // generate overrride
    @Override
    public void displayAthlete(String athlete)
    {
        // rules
        athlete = "************\n" + athlete + "\n************\n";
        athleteSvc.displayAthlete(athlete);
    }
}
