package strings.string_as_string_or_stringbuilder.task01;

/*
 * ������ 1. ��� ����� (������). ������� ���������� ���������� ������ ������ �������� � ���.
 */

public class View {
    private static Logic logic = new Logic();

    public void printMaxNoOfSpaces(String message, String line) {
	System.out.println(message + logic.findMaxNoOfSpaces(line));
    }
}