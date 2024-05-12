package java_homework_week9_SS;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_Zone1Station {

    public static void main(String[] args) {
        //Hashmap declaration
        Map<String, String> zone1Station = new HashMap<>();

        //adding value into the Hashmap
        zone1Station.put("Algate", "Circle Line");
        zone1Station.put("Bond Street", "Central Line,Elizabeth Line, Jubilee Line");
        zone1Station.put("Victoria", "Victoria Line");
        zone1Station.put("Warren Street", "Victoria Line, Northern Line");
        zone1Station.put("Green Park", "Victoria Line, Piccadilly Line, Jubilee Line");
        zone1Station.put("Oxford Circus", "Victoria Line, Bakerloo Line, Central Line");

        String stationName = "Green Park";

        if (zone1Station.containsKey(stationName)) {
            String lines = zone1Station.get(stationName);
            System.out.println("The tube line going through " + stationName + " : " + lines);
        } else {
            System.out.println("Station " + stationName + " is not in Zone 1");
        }
    }
}
