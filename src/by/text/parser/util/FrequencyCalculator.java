package by.text.parser.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCalculator {

    public static Map<String, Integer> textToMap(String textAsString) {
        Map<String, Integer> result = new HashMap<>();
        textAsString = textAsString.toLowerCase();
        String[] words = textAsString.split("\\W+");
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    public static Map<String, Integer> sortDescendingly(Map<String, Integer> map) {
        return map.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
