package com.lambdaschool.solution;

public class HockeyCreationInjector implements AthleteCreationInjector
{
    // generate override
    @Override
    public Processor getProcess()
    {
        return new MyAthlete(new HockeyImpl());
    }
}
