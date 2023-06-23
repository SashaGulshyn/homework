package src.home_work_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import src.home_work_6.EasySearch;
import src.home_work_6.ISearchEngine;

public class TopThreeWords {
    public static void main(String[] args) {
        ISearchEngine searchEngine = new EasySearch();
        String fileName = "Война и мир_книга.txt";
        String[] words  = {"война", "и", "мир"};
        long[] counts = new long[words.length];

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < words.length; i++) {
                    counts[i] += searchEngine.search(line, words[i]);
                }
            }
            for (int i = 0; i < words.length; i++) {
                System.out.println("Слово '" + words[i] + "' встречается " + counts[i] + " раз в тексте");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//        EasySearch SearchEngine = new EasySearch();
//        String filename = "Война и мир_книга.txt";
//        int vCount = (int) SearchEngine.search(filename, "война");
//        int iCount = (int) SearchEngine.search(filename, " и ");
//        int mCount = (int) SearchEngine.search(filename, "мир");
//
//        System.out.println("количество слов война - " + vCount);
//        System.out.println("количество слов и - " + iCount);
//        System.out.println("количество слов мир - " + mCount);
//    }
//}
