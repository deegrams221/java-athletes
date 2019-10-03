package com.lambdaschool.solution;

public class BaseballCreationInjector implements AthleteCreationInjector
{
    // generate override
    @Override
    public Processor getProcess()
    {
        return new MyAthlete(new BaseballImpl());
    }
}
