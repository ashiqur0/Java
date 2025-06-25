package Java_Telusko.collection;

import java.util.HashMap;
import java.util.Map;

public class _2_Map_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Samiul", 98);
        students.put("Nawshin", 88);
        students.put("Simanto", 86);
        students.put("Ruhi", 89);
        students.put("Fahim", 79);

        for(String key : students.keySet()) {
            System.out.println(key + " " + students.get(key));
        }
    }
}
