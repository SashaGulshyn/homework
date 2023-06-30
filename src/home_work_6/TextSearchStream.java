package src.home_work_6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

// Задание номер 8

public class TextSearchStream {
    private static final String RESULT_FILE = "result.txt";

    public static void main(String[] args) {
        String folderAddress = getFolderAddressFromUser();
        if (folderAddress == null) {
            System.out.println("Неверный адрес папки");
            return;
        }

        File folder = new File(folderAddress);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Неверный адрес папки");
            return;
        }

        String keyword = getKeywordFromUser();
        if (keyword == null) {
            System.out.println("Слово для поиска отсутствует");
            return;
        }

        System.out.println("Результаты поиска находятся в головной папке в файле result.txt (формат: имя файла – слово – количество)");

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try (PrintWriter writer = new PrintWriter(new FileWriter(RESULT_FILE))) {
            File[] files = folder.listFiles();
            if (files != null) {
                List<Future<Void>> futures = new ArrayList<>();
                for (File file : files) {
                    futures.add((Future<Void>) executorService.submit(() -> searchInFile(file, keyword, writer)));
                }
                for (Future<Void> future : futures) {
                    future.get();
                }
            }
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    private static String getFolderAddressFromUser() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите адрес папки, из которой будут считаны текстовые файлы: ");   //например ...\projects\homework\b_for_test
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String getKeywordFromUser() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите слово для поиска: ");
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void searchInFile(File file, String keyword, PrintWriter writer) {
        String fileName = file.getName();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                count += countOccurrences(keyword, line);
            }
            writer.println(fileName + " - " + keyword + " - " + count);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countOccurrences(String keyword, String line) {
        int count = 0;
        int index = line.indexOf(keyword);
        while (index != -1) {
            count++;
            index = line.indexOf(keyword, index + keyword.length());
        }
        return count;
    }
}

