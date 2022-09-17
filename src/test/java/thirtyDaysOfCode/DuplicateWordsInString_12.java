package thirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString_12 {
    public static void main(String[] args) {
        String str = "Hey java is best language is java";
        findDuplicateWords(str);
    }

    public static void findDuplicateWords(String input) {
        String[] words = input.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        Set<String> wordsInString = wordCount.keySet();

        for (String word : wordsInString) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + "::" + wordCount.get(word));
            }
        }
    }
}
