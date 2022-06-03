package my.home.epam.module_3.string_as_string_or_stringbuilder.task07;

/*
 * Задача 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class View {
    private static Logic logic = new Logic();

    public void printEditedLine(String line) {
	System.out.println(logic.removeRepeatedCharsAndSpaces(line));
    }
}