package com.lambdaschool.solution;

public class MyAthlete implements Processor
{
    private AthleteService athleteSrv;

    public MyAthlete(AthleteService athleteSrv)
    {
        this.athleteSrv = athleteSrv;
    }

    // generate override
    @Override
    public void displayAthlete() {
        // sout
        System.out.println("*****************");
        athleteSrv.displayAthlete();
        System.out.println("*****************\n");
    }
}

