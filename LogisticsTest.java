package subtask2;

import java.util.Scanner;

public class LogisticsTest {

    private static Logistics logistics;

    static Scanner sc = new Scanner(System.in);
    static String choice = "";

    public static void main(String[] args) {
        config();
        logisticsDeliver();
    }

    static void config(){
        System.out.println("Choose the type of transport (truck or ship):");
        choice = sc.nextLine();
        switch (choice) {
            case ("truck") -> logistics = new RoadLogistics();
            case ("ship") -> logistics = new SeaLogistics();
        }
    }

    static void logisticsDeliver(){
        logistics.planDelivery();
    }
}
