package java_homework_week9_SS;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveIndex {

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

        int i = 5;
        String e = cityName.get(i);

        if (e != null) {
            System.out.println("Element at index " + i + ": " + e);
        } else {
            System.out.println("Invalid index");
        }
    }
}