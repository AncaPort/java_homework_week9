package java_homework_week9_SS;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {

    public static void main(String[] args) {
        //declare Hashmap
        Map<String, Integer> student = new HashMap<>();

        //adding values in HashMap
        student.put("David", 8);
        student.put("Bob", 18);
        student.put("Charles", 12);
        student.put("Peppa", 10);
        student.put("Kate", 16);

        for (Map.Entry<String, Integer> rollNo : student.entrySet()) {
            System.out.println(rollNo.getKey() + " " + rollNo.getValue());
        }
    }
}
