package src.home_work_6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TextFileReader {

    public static void main(String[] args) {
        String fileName = "Война и мир_книга.txt";
        Set<String> words = new HashSet<>();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("[\\p{Space}\\p{Punct}]+");
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        words.add(word.toLowerCase());
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        System.out.println("Количество слов в файле: " + words.size());
    }
}
