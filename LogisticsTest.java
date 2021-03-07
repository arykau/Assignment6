package subtask2;

import java.util.Scanner;

public class LogisticsTest {

    private static Logistics logistics;

    public static void main(String[] args) {
        configuration();
        logisticsService();
    }

    static void configuration(){
        String transport = "truck";
        if (transport.equals("truck")){
            logistics = new RoadLogistics();
        }else if (transport.equals("ship")){
            logistics = new SeaLogistics();
        }
    }

    static void logisticsService(){
        logistics.planDelivery();
    }
}
