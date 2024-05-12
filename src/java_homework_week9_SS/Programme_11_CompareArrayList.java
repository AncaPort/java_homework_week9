package java_homework_week9_SS;

import java.util.ArrayList;

/**
 * . Declare following two arrylist and compare it.
 */
public class Programme_11_CompareArrayList {

    public static void main(String[] args) {//MAin method

        //array list 1
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        //arraylist 2
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //compare arraylist
        boolean isRight = c1.equals(c2);

        if (isRight) {
            System.out.println("ArrayList c1 and c2 are equal.");
        } else {
            System.out.println("ArrayList c1 and c2 are not equal.");
        }
    }

}
