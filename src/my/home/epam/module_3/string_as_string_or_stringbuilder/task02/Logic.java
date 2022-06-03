package my.home.epam.module_3.string_as_string_or_stringbuilder.task02;

/*
 * Задача 2. В строке вставить после каждого символа 'a' символ 'b'.
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