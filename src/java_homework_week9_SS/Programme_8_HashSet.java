package java_homework_week9_SS;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_HashSet {

    public static void main(String[] args) {
        //hashset declaration
        HashSet<Integer> num = new HashSet<>();

        //value adding into the Hashset
        num.add(4);
        num.add(7);
        num.add(8);

        System.out.println("Number between 1 to 10 that is in set:");

        for (int i = 1; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set");
            }
        }

    }
}
