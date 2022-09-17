package Collections;

import java.util.*;

public class ArrayListWithLinkedHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList);

        HashSet<Integer> set = new LinkedHashSet<>(numbersList);
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        System.out.println(set);


    }
}
