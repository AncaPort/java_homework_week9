package java_homework_week9_SS;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_EmptyArrayList {

    public static void main(String[] args) {//main method

        //array list creation
        ArrayList<String> cityName = new ArrayList<>();

        //value adding into the arraylist
        cityName.add("London");
        cityName.add("Croydon");
        cityName.add("Manchester");
        cityName.add("Bristol");
        cityName.add("Cardiff");
        cityName.add("Sheffield");
        cityName.add("Leeds");

        if (cityName.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }

}
