package strings.string_as_char_array.task05;

/*
 * «адача 5. ”далить в строке все лишние пробелы, то есть серии подр€д идущих пробелов заменить на одиночные пробелы.  райние пробелы в строке удалить.
 */

public class View {
    Logic logic = new Logic();

    public void printLineWithoutSpacingIssues(String line) {
	System.out.println(logic.removeSpacingIssues(line));
    }
}