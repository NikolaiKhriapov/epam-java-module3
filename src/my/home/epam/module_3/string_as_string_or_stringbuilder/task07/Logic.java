package my.home.epam.module_3.string_as_string_or_stringbuilder.task07;

import java.util.Scanner;

/*
 * Задача 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
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

    public String removeRepeatedCharsAndSpaces(String line) {
	StringBuilder lineSB = new StringBuilder(line);

	for (int i = 0; i < lineSB.length(); i++) {
	    for (int j = i + 1; j < lineSB.length(); j++) {
		if ((lineSB.charAt(i) == lineSB.charAt(j)) || (lineSB.charAt(j) == ' ')) {
		    lineSB.deleteCharAt(j);
		    j--;
		}
	    }
	}

	return String.valueOf(lineSB);
    }
}