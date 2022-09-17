package thirtyDaysOfCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInArray_6 {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C++", "C", "Ruby", "Ruby"};

        // Worst time complexity O(n2)
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate name :: " + names[i]);
                    break;
                }
            }
        }

        System.out.println("============================");

        // Using HashSet

        Set<String> s = new HashSet<>();
        for (String name : names) {
            if (!s.add(name)) {
                System.out.println("Duplicate name :: " + name);
            }
        }


        System.out.println("============================");

        Map<String, Integer> result = new HashMap<>();

        for (String name : names) {
            Integer count = result.get(name);
            if (count == null) {
                result.put(name, 1);
            }
            else {
                result.put(name, ++count);
            }
        }
        System.out.println(result);
        Set<Map.Entry<String, Integer>> entrySet = (Set<Map.Entry<String, Integer>>) result.entrySet();

        for (Map.Entry<String, Integer> entry1: entrySet){
            if (entry1.getValue() > 1){
                System.out.println(entry1.getKey());
            }
        }
    }
}
