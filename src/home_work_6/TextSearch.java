package src.home_work_6;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class TextSearch {

    public static void main(String[] args) {
        TextSearch textSearch = new TextSearch();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите путь к папке: ");   //...\projects\homework\books\Классика
        String folderPath = scanner.nextLine();

        textSearch.setFolderPath(folderPath);
        textSearch.scanFolder();
        textSearch.displayFilesList();

        System.out.print("Выберите номер файла, который будет открыт: ");
        int fileNumber = scanner.nextInt();
        scanner.nextLine();
        textSearch.selectFile(fileNumber);

        System.out.print("Введите текст, который нужно найти: ");
        String searchText = scanner.nextLine();
        textSearch.search(searchText);

        textSearch.displaySearchResults();
        textSearch.saveSearchResults();
    }

    private String folderPath;
    private List<String> filesList;
    private String currentFile;
    private List<String> searchResults;

    public TextSearch() {
        this.folderPath = "";
        this.filesList = new ArrayList<>();
        this.currentFile = "";
        this.searchResults = new ArrayList<>();
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public void scanFolder() {
        File folder = new File(folderPath);
        File[] fileList = folder.listFiles();

        for (File file : fileList) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                filesList.add(file.getName());
            }
        }
    }

    public void displayFilesList() {
        System.out.println("Лист текстовых файлов в " + folderPath + ":");
        int counter = 1;
        for (String fileName : filesList) {
            System.out.println(counter + ". " + fileName);
            counter++;
        }
    }

    public void selectFile(int fileNumber) {
        String fileName = filesList.get(fileNumber - 1);
        currentFile = String.valueOf(new File(fileName));
        int currentFileIndex = fileNumber;
        System.out.println("Выбранный файл: " + fileName);
    }

    /**
     * Я пробовал конвертить/энкодить ANSI налету в Cyrillic, но постоянно сталкиваюсь с ошибкой FileNotFound Exception.
     * При том что вроде как отдаю путь правильный, и в дебаге вижу, что currentFile подхвачён который нужен. Видимо, здесь
     * следует использовать другой подход, как например в твоём видео..
     */

    public void search(String searchText) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(currentFile), Charset.forName("ISO_8859_1")))) {
            String line;
            int count = 0;
            File outputFile = new File("converted.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), Charset.forName("Cp866")));
            while ((line = reader.readLine()) != null) {
                String convertedLine = new String(line.getBytes(Charset.forName("Cp866")), Charset.forName("Cp866"));
                if (convertedLine.contains(searchText)) {
                    count++;
                }
                writer.write(convertedLine);
                writer.newLine();
            }
            writer.close();
            searchResults.add(currentFile + " - " + searchText + " - " + count);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }


    public void displaySearchResults() {
        System.out.println("Результаты поиска:");
        for (String result : searchResults) {
            System.out.println(result);
        }
    }

    public void saveSearchResults() {
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("result.txt"), Charset.forName("Cp866")))) {
            for (String result : searchResults) {
                writer.println(result);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
