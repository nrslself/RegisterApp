package ch.spring.week01_Assignment02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkersFarm {

    private int workersNumber = 0;
    private double totalPayment = 0;
    private List<Worker> disabledWorkersList= new ArrayList<>();
    private List<Worker> lazyWorkerList = new ArrayList<>();
    private List<Worker> childWorkerList = new ArrayList<>();
    private List<Worker> goodWorkerList = new ArrayList<>();


    public void generateFarm(int belowLimit, int upperLimit) {

        // generating workers of the farm as a Worker list randomly
        Random random = new Random();

        workersNumber = random.nextInt(upperLimit - belowLimit) + belowLimit;
        for (int i = 0; i < workersNumber; i++) {
            disabledWorkersList.add(new DisabledWorker(10, 10));
        }

        workersNumber = random.nextInt(upperLimit - belowLimit) + belowLimit;
        for (int i = 0; i < workersNumber; i++) {
            lazyWorkerList.add(new LazyWorker(23, 20));
        }

        workersNumber = random.nextInt(upperLimit - belowLimit) + belowLimit;
        for (int i = 0; i < workersNumber; i++) {
            childWorkerList.add(new ChildWorker(10, 30));
        }

        workersNumber = random.nextInt(upperLimit - belowLimit) + belowLimit;
        for (int i = 0; i < workersNumber; i++) {
            goodWorkerList.add(new GoodWorker(40, 40));
        }

    }

    public double getTotalPayment(){

        // getting disabledworkers total payments
        for (int i=0 ; i<disabledWorkersList.size() ; i++){
            totalPayment +=disabledWorkersList.get(i).getWage();
        }
        // adding lazyworkers payments to total payment
        for (int i=0 ; i<lazyWorkerList.size() ; i++){
            totalPayment +=lazyWorkerList.get(i).getWage();
        }
        // getting childworkers payments total payments
        for (int i=0 ; i<childWorkerList.size() ; i++){
            totalPayment +=childWorkerList.get(i).getWage();
        }
        // getting goodworkers payments total payments
        for (int i=0 ; i<goodWorkerList.size() ; i++){
            totalPayment +=goodWorkerList.get(i).getWage();
        }

        return totalPayment;

    }
}
