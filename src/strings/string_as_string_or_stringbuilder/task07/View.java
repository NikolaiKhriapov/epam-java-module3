package strings.string_as_string_or_stringbuilder.task07;

/*
 * ������ 7. �������� ������. ��������� ������� �� ��� ������������� ������� � ��� �������. 
 * ��������, ���� ���� ������� "abc cde def", �� ������ ���� �������� "abcdef".
 */

public class View {
    private static Logic logic = new Logic();

    public void printEditedLine(String line) {
	System.out.println(logic.removeRepeatedCharsAndSpaces(line));
    }
}