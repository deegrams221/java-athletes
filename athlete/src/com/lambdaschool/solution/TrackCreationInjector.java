package com.lambdaschool.solution;

public class TrackCreationInjector implements AthleteCreationInjector
{
    // generate override
    @Override
    public Processor getProcess()
    {
        return new MyAthlete(new TrackImpl());
    }
}
