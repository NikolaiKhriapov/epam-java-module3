package strings.string_as_char_array.task05;

/*
 * ������ 5. ������� � ������ ��� ������ �������, �� ���� ����� ������ ������ �������� �������� �� ��������� �������. ������� ������� � ������ �������.
 */

public class View {
    Logic logic = new Logic();

    public void printLineWithoutSpacingIssues(String line) {
	System.out.println(logic.removeSpacingIssues(line));
    }
}