package strings.string_as_char_array.task05;

/*
 * ������ 5. ������� � ������ ��� ������ �������, �� ���� ����� ������ ������ �������� �������� �� ��������� �������. ������� ������� � ������ �������.
 */

public class Main {

    public static void main(String[] args) {
	View view = new View();

	String line = "    Line   to  be   checked   for    spacing  issues   ";

	view.printLineWithoutSpacingIssues(line);
    }
}