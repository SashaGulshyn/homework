package src.home_work_6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class TopNWords {

    public static void main(String[] args) {
        String fileName = "Война и мир_книга.txt";
        int topN = 30;

        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("[\\p{Space}\\p{Punct}]+");
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        String lowercaseWord = word.toLowerCase();
                        if (wordCounts.containsKey(lowercaseWord)) {
                            wordCounts.put(lowercaseWord, wordCounts.get(lowercaseWord) + 1);
                        } else {
                            wordCounts.put(lowercaseWord, 1);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        List<Map.Entry<String, Integer>> sortedWordCounts = new ArrayList<>(wordCounts.entrySet());
        sortedWordCounts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Топ " + topN + " слов:");
        for (int i = 0; i < topN && i < sortedWordCounts.size(); i++) {
            Map.Entry<String, Integer> entry = sortedWordCounts.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}