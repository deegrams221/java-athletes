package com.lambdaschool.solution;

public class MyAthlete implements Processor
{
    // constructor injections
    private AthleteService athSvc;

    public MyAthlete(AthleteService athSvc)
    {
        this.athSvc = athSvc;
    }

    // generate overrides
    @Override
    public void displayAthlete(String sport, String athlete)
    {
        // rules
        athlete = "****************\n" + sport + athlete + "\n****************\n";
        athSvc.displayAthlete(sport, athlete);
    }
}
