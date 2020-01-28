package com.lambdaschool.solution;

public class HockeyAthleteCreationInjector implements AthleteCreationInjector
{
    // generate override
    @Override
    public Processor getProcess()
    {
        return new MyAthlete(new HockeyAthleteImpl());
    }
}
