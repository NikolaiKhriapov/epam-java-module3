package strings.string_as_char_array.task03;

/*
* ������ 3. � ������ ����� ���������� ����.
*/

public class Logic {

    public int countDigits(String line) {
	char[] charArray = line.toCharArray();
	
	int digitCount = 0;
	for (char oneChar : charArray) {
	    if (Character.isDigit(oneChar)) {
		digitCount++;
	    }
	}
	return digitCount;
    }
}