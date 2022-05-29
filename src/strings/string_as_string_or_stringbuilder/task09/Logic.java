package strings.string_as_string_or_stringbuilder.task09;

import java.util.Scanner;

/*
 * ������ 9. ��������� ���������� �������� (���������) � ��������� (�������) ���� � ��������� ������. 
 * ��������� ������ ���������� �����.
 * 
 * ������: Line 01 For Checking The Conditions! ������ 01 ��� �������� ������� ������!
 */

public class Logic {

    public String inputLine(String message) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print(message);
	while (!scanner.hasNextLine()) {
	    System.out.print(message);
	    scanner.next();
	}

	return scanner.nextLine();

    }

    public int findNoOfLowerCaseLetters(String line) {
	int NoOfLowerCaseLetters = 0;

	for (int i = 0; i < line.length(); i++) {
	    if (String.valueOf(line.charAt(i)).matches("[a-z]")) {
		NoOfLowerCaseLetters++;
	    }
	}

	return NoOfLowerCaseLetters;
    }

    public int findNoOfUpperCaseLetters(String line) {
	int NoOfUpperCaseLetters = 0;

	for (int i = 0; i < line.length(); i++) {
	    if (String.valueOf(line.charAt(i)).matches("[A-Z]")) {
		NoOfUpperCaseLetters++;
	    }
	}

	return NoOfUpperCaseLetters;
    }
}