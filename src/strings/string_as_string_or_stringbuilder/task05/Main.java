package strings.string_as_string_or_stringbuilder.task05;

/*
 * ������ 5. ����������, ������� ��� ����� �������� �������� ������ ����������� ����� ���.
 */

public class Main {

    public static void main(String[] args) {

	char givenChar = '�';
	String line = "������, ��������� �����������, �������� ���������.";

	int aCount = 0;
	for (int i = 0; i < line.length(); i++) {
	    if (line.charAt(i) == givenChar) {
		aCount++;
	    }
	}

	System.out.println("����� \"" + givenChar + "\" ����������� " + aCount + " ���(�).");
    }
}