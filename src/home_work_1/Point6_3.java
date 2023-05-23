package src.home_work_1;

import src.home_work_1.api.ICommunicationPrinter;

public class Point6_3 implements ICommunicationPrinter {
    public String welcome(String name) {
        if (name.isBlank() || !name.chars().anyMatch(Character::isAlphabetic)) {
            return "Похоже что это не имя";
        }

        switch (name) {
            case "Вася":
                return "Привет!\nЯ тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}