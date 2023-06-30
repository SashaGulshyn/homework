package src.home_work_6.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.home_work_6.TextSearchStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSearchStreamTest {

    @Test
    public void testSearchInFile() {
        String keyword = "несколькослитныхслов";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(outputStream);

        File file = new File("C:\\projects\\homework\\books_for_test\\Классика\\Тестовый_файл.txt");
        try (PrintWriter fileWriter = new PrintWriter(file)) {
            fileWriter.println("Утро доброе выпейте чаю");
            fileWriter.println("несколькослитныхслов");
            fileWriter.println("Эта строка не содержит искомого слова");
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextSearchStream.searchInFile(file, keyword, writer);
        writer.flush();

        String expectedOutput = "Тестовый_файл.txt - несколькослитныхслов - 1\r\n";
        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }
}

//   @Test
//   public void testCountOccurrences() {
//       String keyword = "Булгаков'";
//       String line = "Булгаков ввёл чтобы проверить";

//       int expectedCount = 1;
//       int actualCount = TextSearchStream.countOccurrences(keyword, line);

//       Assertions.assertEquals(expectedCount, actualCount);
//   }

