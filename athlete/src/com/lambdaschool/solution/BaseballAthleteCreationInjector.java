package com.lambdaschool.solution;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
    // generate override
    @Override
    public Processor getProcess()
    {
        return new MyAthlete(new BaseballAthleteImpl());
    }
}
