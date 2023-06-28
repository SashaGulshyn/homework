package src.home_work_6;

public interface ISearchEngine {
    /**
     * Интерфейс для поиска заданного слова с выводом кол-ва повторений данного слова
     * @param text - текст, в котором нужно осуществлять поиск
     * @param word - слово, которое нужно искать
     * @return количество повторений слова в тексте, в котором производится поиск
     */
    long search(String text, String word);
}
