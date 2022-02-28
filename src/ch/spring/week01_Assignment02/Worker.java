package ch.spring.week01_Assignment02;

public abstract class Worker {

    private double wage;
    private int workHour;
    private double hourlyCost;

    Worker(double hourlyCost, int workHour){
        this.hourlyCost = hourlyCost;
        this.workHour = workHour;
    }

    public double getWage(){

        return workHour*hourlyCost;
    }
}
