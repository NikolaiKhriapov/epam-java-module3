package strings.string_as_string_or_stringbuilder.task08;

/*
 * ������ 8. �������� ������ ����, ����������� ���������. ����� ����� ������� ����� � ������� ��� �� �����. 
 * ������, ����� ����� ������� ���� ����� ���� ���������, �� ������������.
 * 
 * ������: ������, ��������� �����������, �������� ���������.
 */

public class Main {

    public static void main(String[] args) {
	Logic logic = new Logic();
	View view = new View();

	String line = logic.inputLine("������� ������: ");

	view.printLongestWord("\n" + "����� ������� �����: ", line);
    }
}