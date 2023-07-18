package exercise;

import java.util.*;

class App {
    public static int countRepetition(String s, List<String> listWords) {
        int countRepeat = 0;
        while (listWords.contains(s)) {
            countRepeat++;
            listWords.remove(s);
        }
        return countRepeat;
    }
    public static Map<String, Integer> getWordCount(String input) {
        Map<String, Integer> emptyMap = new HashMap<>(0);
        if (input.length() == 0) {
            return emptyMap;
        }
        Map<String, Integer> wordsMap = new HashMap<>();
        int countRepeat = 0;
        String[] words = input.split(" ");
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists, words);
        for (int i = 0; i < lists.size();) {
            countRepeat++;
            String word = lists.get(i);
            lists.remove(i);
            countRepeat = countRepeat + countRepetition(word, lists);
            wordsMap.put(word, countRepeat);
            countRepeat = 0;
        }
        return wordsMap;
    }
    public static String toString(Map<String, Integer> wordsMap) {
        if (wordsMap.isEmpty()) {
            return "{}";
        }
        String result = "";
        for (Map.Entry<String, Integer> word : wordsMap.entrySet()) {
            result = result + "  " + word.getKey() + ": " + word.getValue() + "\n";

        }
        return "{\n" + result + "}";
    }
}

