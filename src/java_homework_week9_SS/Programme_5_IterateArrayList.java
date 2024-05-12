package java_homework_week9_SS;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_IterateArrayList {

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

        //Iterator
        Iterator<String> city = cityName.iterator();
        while (city.hasNext()) {
            System.out.println(city.next() + " ");
        }
    }
}
