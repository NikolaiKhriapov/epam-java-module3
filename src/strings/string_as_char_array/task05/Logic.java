package strings.string_as_char_array.task05;

/*
 * ������ 5. ������� � ������ ��� ������ �������, �� ���� ����� ������ ������ �������� �������� �� ��������� �������. ������� ������� � ������ �������.
 */

public class Logic {

    public String removeSpacingIssues(String line) {
	// �������� �������� � ������ ������
	do {
	    if (line.startsWith(" ")) {
		char[] charArray = line.toCharArray();
		char[] newCharArray = new char[charArray.length - 1];

		for (int i = 0; i < newCharArray.length; i++) {
		    newCharArray[i] = charArray[i + 1];
		}
		line = String.valueOf(newCharArray);
	    }
	} while (line.startsWith(" "));

	// �������� �������� � ����� ������
	do {
	    if (line.endsWith(" ")) {
		char[] charArray = line.toCharArray();
		char[] newCharArray = new char[charArray.length - 1];

		for (int i = 0; i < newCharArray.length; i++) {
		    newCharArray[i] = charArray[i];
		}
		line = String.valueOf(newCharArray);
	    }
	} while (line.endsWith(" "));

	// �������� ������� ��������
	do {
	    char[] charArray = line.toCharArray();
	    char[] newCharArray = new char[charArray.length - 1];

	    int index = 0;
	    for (int i = 0; i < charArray.length - 1; i++) {
		if (charArray[i] == ' ') {
		    if (charArray[i + 1] == ' ') {
			index = i;
			break;
		    }
		}
	    }
	    for (int i = 0; i < newCharArray.length; i++) {
		if (i < index) {
		    newCharArray[i] = charArray[i];
		} else if (i >= index) {
		    newCharArray[i] = charArray[i + 1];
		}
	    }
	    line = String.valueOf(newCharArray);
	} while (hasDoubleSpaces(line));

	return line;
    }

    public boolean hasDoubleSpaces(String line) {
	char[] charArray = line.toCharArray();

	boolean hasSpacingIssues = false;
	for (int i = 0; i < charArray.length - 1; i++) {
	    if ((line.startsWith(" ")) || (charArray[i] == ' ') || (line.endsWith(" "))) {
		if (charArray[i + 1] == ' ') {
		    hasSpacingIssues = true;
		}
	    }
	}
	return hasSpacingIssues;
    }
}