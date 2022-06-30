package my.home.epam.module_3.string_as_char_array.task05;

/*
 * Задача 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
 */

public class Main {

    public static void main(String[] args) {
	View view = new View();

	String line = "    Line   to  be   checked   for    spacing  issues   ";

	view.printLineWithoutSpacingIssues(line);
    }
}