package strings.string_as_string_or_stringbuilder.task09;

/*
 * ������ 9. ��������� ���������� �������� (���������) � ��������� (�������) ���� � ��������� ������. 
 * ��������� ������ ���������� �����.
 * 
 * ������: Line 01 For Checking The Conditions! ������ 01 ��� �������� ������� ������!
 */

public class View {
    private static Logic logic = new Logic();

    public void printNoOfLowerCaseLetters(String line) {
	System.out.println("���������� �������� ����: " + logic.findNoOfLowerCaseLetters(line));
    }

    public void printNoOfUpperCaseLetters(String line) {
	System.out.println("���������� ��������� ����: " + logic.findNoOfUpperCaseLetters(line));
    }
}