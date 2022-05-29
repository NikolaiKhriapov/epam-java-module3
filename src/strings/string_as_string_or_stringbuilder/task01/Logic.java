package strings.string_as_string_or_stringbuilder.task01;

/*
 * Задача 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Logic {

    public int findMaxNoOfSpaces(String line) {
	StringBuilder stringBuilder = new StringBuilder(line);

	int maxCount = 0;
	for (int i = 0; i < line.length(); i++) {
	    int count = 0;
	    while ((i < line.length()) && (stringBuilder.charAt(i) == ' ')) {
		count++;
		i++;
	    }
	    if (count > maxCount) {
		maxCount = count;
	    }
	}
	return maxCount;
    }
}