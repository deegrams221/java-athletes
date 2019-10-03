package com.lambdaschool.solution;

public class RugbyAthleteCreationInjector implements AthleteCreationInjector
{
    // generate override
    @Override
    public Processor getProcess()
    {
        return new MyAthlete(new RugbyAthleteImpl());
    }
}
