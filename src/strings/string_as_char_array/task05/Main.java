package strings.string_as_char_array.task05;

/*
 * «адача 5. ”далить в строке все лишние пробелы, то есть серии подр€д идущих пробелов заменить на одиночные пробелы.  райние пробелы в строке удалить.
 */

public class Main {

    public static void main(String[] args) {
	View view = new View();

	String line = "    Line   to  be   checked   for    spacing  issues   ";

	view.printLineWithoutSpacingIssues(line);
    }
}