package strings.string_as_string_or_stringbuilder.task10;

/*
 * ������ 10. ������ X ������� �� ���������� �����������, ������ �� ������� ��������� ������, 
 * ��������������� ��� �������������� ������. ���������� ���������� ����������� � ������ X.
 */

public class Main {

    public static void main(String[] args) {
	View view = new View();

	String line = "����������� � 1. ����������� � 2! ����������� � 3? ����������� � 4.";

	view.printNoOfSentences("���������� ����������� � ������: ", line);
    }
}