package strings.string_as_string_or_stringbuilder.task08;

/*
 * Задача 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 * 
 * Пример: Наукой, изучающей предложение, является синтаксис.
 */

public class Main {

    public static void main(String[] args) {
	Logic logic = new Logic();
	View view = new View();

	String line = logic.inputLine("Введите строку: ");

	view.printLongestWord("\n" + "Самое длинное слово: ", line);
    }
}