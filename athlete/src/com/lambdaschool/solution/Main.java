package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Athlete
        injector = new HockeyCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Rugby Athlete
        injector = new RugbyCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Athlete
        injector = new BaseballCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();
    }
}
