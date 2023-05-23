package src.home_work_1;

import src.home_work_1.api.ICommunicationPrinter;


public class Point6_1 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        if (name.isBlank() || !name.chars().anyMatch(Character::isAlphabetic)) {
            return "Похоже что это не имя";
        }
        if (name.equals("Вася")) {
            return "Привет!\nЯ тебя так долго ждал ";
        }
        if (name.equals("Анастасия")) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}