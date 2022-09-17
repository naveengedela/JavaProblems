package Top30_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInArrayNeedToCheckAgain {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		duplicateElementsWitnNumbers(intArr);
		System.out.println();
		duplicateElementsWitnNames(names);
		System.out.println();
		withMap(names);
		hashSet(names);
	}

	private static void duplicateElementsWitnNumbers(int[] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] == intArr[j]) {
					System.out.println(intArr[j]);
				}
			}

		}
	}

	private static void duplicateElementsWitnNames(String[] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] == intArr[j]) {
					System.out.println(intArr[j]);
				}
			}

		}
	}

	// O(2n)
	private static void withMap(String[] intArr) {
		Map<String, Integer> result = new HashMap<>();

		for (String str : intArr) {
			if (result.containsKey(str)) {
				result.put(str, result.get(str) + 1);
			} else {
				result.put(str, 1);
			}
		}

		for (Map.Entry<String, Integer> entry : result.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}

	}
	
	// O(n)
	private static void hashSet(String[] intArr) {
		Set<String> store = new HashSet<>();
		
		for (String name: intArr) {
			if (store.add(name) == false) {
				System.out.println(name);
			}
		}
	}

}
