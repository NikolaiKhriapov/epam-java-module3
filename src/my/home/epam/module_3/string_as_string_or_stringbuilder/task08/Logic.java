package my.home.epam.module_3.string_as_string_or_stringbuilder.task08;

import java.util.Scanner;

/*
 * Задача 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 * 
 * Пример: Наукой, изучающей предложение, является синтаксис.
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

    public String findLongestWord(String line) {
	String[] words = line.split(" ");

	int maxLength = 0;
	String longestWord = "";
	for (int i = 0; i < words.length; i++) {
	    if (words[i].length() > maxLength) {
		maxLength = words[i].length();
		longestWord = words[i];
	    }
	}

	return longestWord;
    }
}