package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.Set;

public class EasySearch implements ISearchEngine {
    private Set<Character> splitChar = Set.of(' ', ',', '.', ';', ':', '!', '?', '-', '(', ')', '"', '\'');

    @Override
    public long search(String text, String word) {


        int lengthWords = word.length(); // переменная нужна для увеличения позиции, будет использоваться в цикле, поэтому ее
        // лучше всего сразу сохранить
        long count = 0;

        int posistion = -1; //нужен для метода indexOf - так как он возвращает -1, если ничего не нашел


        while ((posistion = text.indexOf(word, posistion)) > -1) {
            // здесь мы проверяем разделитель перед искомым словом и после искомого слова
            if (checkSplitChar(text, posistion - 1) && checkSplitChar(text, posistion + lengthWords)) {
                count++;
            }
            // position++; // самое простое решение
            posistion += lengthWords; // так намного лучше) позиция будет увеличиваться на всю длинну слова
        }
        return count;
    }

    /**
     * Проверяем позицию на наличие символа разделителя
     *
     * @param text     где проверяется символ
     * @param position порядковый номер символа
     * @return true  - если тут находится разделитель между словами
     * false - если тут нет разделителя
     */
    private boolean checkSplitChar(String text, int position) {
        if (position < 0) {// мне кажется это запись не очень, потому что переменная position по умолчаниею задана -1. те.меньше нуля
            //плюс  мы ее считаем методом indexOf, который вернет -1, если такого символа нет, например какая нибудь закарючка
            // тогда мы в любом случае попадем внутрь цикла и счетчик вернет  1
            // в нашем случае, для проверки того, что наш символ самый первый, лучше написать
            //position=0;
            return true;
        }
        if (position >= text.length()) {
            return true;
        }

        if (!checkSpecialSplitChar(text, position))
            return false;

        return splitChar.contains(text.charAt(position));
    }

    /**
     * Проверяем позицию на наличие особенных символов прописанных в доке (https:|| ... .... ....)
     *
     * @param text     где проверяется символ
     * @param position порядковый номер позиции
     * @return true - если по указанным правилам этот символ является разделителем или данный символ не обрабатывается данным методом
     * false - если по указанным правилам этот символ является частью слова
     */
    private boolean checkSpecialSplitChar(String text, int position) {
        char charAt = text.charAt(position); // видимо будет использоваться много раз, сохраняем результат как выглядит наш искомы

        if (charAt == '-') {
            int nextCheckLetter = position - 1;
            if (nextCheckLetter >= 0) {
                char nextCharAt = text.charAt(nextCheckLetter);
                if (nextCharAt == '-' || Character.isLetter(nextCharAt)) {
                    return false;
                }
            }
        }


        return true;
    }
}
