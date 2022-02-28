package ch.spring.week01_Assignment02;

public class WorkersFarmApp {

    public static void main(String[] args) {

     WorkersFarm farm =  new WorkersFarm();

     farm.generateFarm(2,6);

     System.out.println("Total payment of thw whole farm is:"+ farm.getTotalPayment());

    }
}
