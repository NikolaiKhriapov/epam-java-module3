package strings.string_as_string_or_stringbuilder.task08;

/*
 * ������ 8. �������� ������ ����, ����������� ���������. ����� ����� ������� ����� � ������� ��� �� �����. 
 * ������, ����� ����� ������� ���� ����� ���� ���������, �� ������������.
 * 
 * ������: ������, ��������� �����������, �������� ���������.
 */

public class View {
    private static Logic logic = new Logic();

    public void printLongestWord(String message, String line) {
	System.out.println(message + logic.findLongestWord(line));
    }
}