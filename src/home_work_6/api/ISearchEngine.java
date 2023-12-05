package home_work_6.api;

public interface ISearchEngine {
    // Метод возвращает информацию о количестве раз которое встречается слово в тексте.
    // Первый параметр - текст в котором ищем, второй параметр - что ищем в тексте.
    long search(String text, String word);
}
