package com.lambdaschool.solution;

public class HockeyAthleteImpl implements AthleteService
{
    // generate override
    @Override
    public void displayAthlete(String sport, String athlete)
    {
        // sout
        System.out.println(sport + " " + athlete);
    }
}
