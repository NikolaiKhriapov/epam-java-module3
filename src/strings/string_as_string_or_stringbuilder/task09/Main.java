package strings.string_as_string_or_stringbuilder.task09;

/*
 * ������ 9. ��������� ���������� �������� (���������) � ��������� (�������) ���� � ��������� ������. 
 * ��������� ������ ���������� �����.
 * 
 * ������: Line 01 For Checking The Conditions! ������ 01 ��� �������� ������� ������!
 */

public class Main {

    public static void main(String[] args) {
	Logic logic = new Logic();
	View view = new View();

	String line = logic.inputLine("������� ������: ");

	System.out.println();
	
	view.printNoOfLowerCaseLetters(line);
	view.printNoOfUpperCaseLetters(line);
    }
}