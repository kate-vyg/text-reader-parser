package by.text.parser.util;

import java.util.HashMap;
import java.util.Map;

public class TextSort {

    public TextSort(String textAsString) {
        String[] key = textAsString.split("[\\s\\n/.!,;?—()]");
        Map<String, Integer> map = new HashMap<>();
        for (String content : key) {
            String lowerCase = content.toLowerCase();
            if (map.containsKey(lowerCase)) {
                map.put(lowerCase, map.get(lowerCase) + 1);
            } else {
                map.put(lowerCase, 1);
            }
        }

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
