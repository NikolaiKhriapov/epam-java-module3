package strings.string_as_string_or_stringbuilder.task02;

/*
 * ������ 2. � ������ �������� ����� ������� ������� 'a' ������ 'b'.
 */

public class Logic {

    public String putBAfterA(String line) {
	StringBuilder stringBuilder = new StringBuilder(line);

	for (int i = 0; i < stringBuilder.length(); i++) {
	    if (stringBuilder.charAt(i) == 'a') {
		stringBuilder.insert(i + 1, 'b');
	    }
	}
	return String.valueOf(stringBuilder);
    }
}