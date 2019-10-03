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
    public void displayAthlete(String athlete)
    {
        // rules
        athlete = "****************\n" + athlete + "\n****************\n";
        athSvc.displayAthlete(athlete);
    }
}
