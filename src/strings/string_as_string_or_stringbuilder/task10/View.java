package strings.string_as_string_or_stringbuilder.task10;

/*
 * ������ 10. ������ X ������� �� ���������� �����������, ������ �� ������� ��������� ������, 
 * ��������������� ��� �������������� ������. ���������� ���������� ����������� � ������ X.
 */

public class View {
    private static Logic logic = new Logic();

    public void printNoOfSentences(String message, String line) {
	System.out.print(message);
	System.out.println(logic.findNoOfSentences(line));
    }
}