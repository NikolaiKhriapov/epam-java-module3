package my.home.epam.module_3.string_as_string_or_stringbuilder.task08;

/*
 * Задача 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 * 
 * Пример: Наукой, изучающей предложение, является синтаксис.
 */

public class View {
    private static Logic logic = new Logic();

    public void printLongestWord(String message, String line) {
	System.out.println(message + logic.findLongestWord(line));
    }
}