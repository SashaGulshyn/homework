package src.home_work_1.api;

public interface ICommunicationPrinter {

    /**
     * Метод для вывода приветствия
     * @param name введённое юзером имя
     * @return возвращает сообщение в зависимости от введённого имени юзером
     */
    public String welcome (String name);

}
