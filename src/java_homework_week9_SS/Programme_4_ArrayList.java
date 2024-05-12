package java_homework_week9_SS;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ArrayList {


    public static void main(String[] args) {//main method

        ArrayList<String> colours = new ArrayList<>();//create ArrayList
        colours.add("red");
        colours.add("Pink");
        colours.add("Green");
        colours.add("Orange");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Grey");
        colours.add("White");


        for (String color : colours) {//for each Loop

            System.out.println(color);
        }
    }
}
