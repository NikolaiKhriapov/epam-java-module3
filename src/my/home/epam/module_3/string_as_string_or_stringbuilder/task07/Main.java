package my.home.epam.module_3.string_as_string_or_stringbuilder.task07;

/*
 * Задача 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Main {

    public static void main(String[] args) {
	Logic logic = new Logic();
	View view = new View();

	String line = logic.inputLine("Введите строку: ");

	view.printEditedLine(line);
    }
}