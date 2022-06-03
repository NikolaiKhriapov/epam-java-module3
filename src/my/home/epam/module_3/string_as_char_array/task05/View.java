package my.home.epam.module_3.string_as_char_array.task05;

/*
 * Задача 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
 */

public class View {
    Logic logic = new Logic();

    public void printLineWithoutSpacingIssues(String line) {
	System.out.println(logic.removeSpacingIssues(line));
    }
}