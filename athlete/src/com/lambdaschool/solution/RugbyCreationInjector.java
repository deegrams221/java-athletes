package com.lambdaschool.solution;

public class RugbyCreationInjector implements AthleteCreationInjector
{
    // generate override
    @Override
    public Processor getProcess()
    {
        return new MyAthlete(new RugbyImpl());
    }
}
