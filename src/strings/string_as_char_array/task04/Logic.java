package strings.string_as_char_array.task04;

/*
 * ������ 4. � ������ ����� ���������� �����.
 */

public class Logic {
    
    public int countNumbers(String line) {
	char[] charArray = line.toCharArray();
	
	int numberCount = 0;
	for (int i = 0; i < charArray.length; i++) {
	    if (Character.isDigit(charArray[i])) {
		numberCount++;
		for (int j = i; j < charArray.length; j++) {
		    i = j;
		    if (!Character.isDigit(charArray[j])) {
			break;
		    }
		}
	    }
	}
	return numberCount;
    }
}