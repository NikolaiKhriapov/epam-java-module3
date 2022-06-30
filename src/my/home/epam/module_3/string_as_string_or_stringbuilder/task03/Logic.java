package my.home.epam.module_3.string_as_string_or_stringbuilder.task03;

/*
 * Задача 3. Проверить, является ли заданное слово палиндромом.
 */

public class Logic {

    public boolean isPalindrome(String word) {
	word = word.toLowerCase();

	boolean isPalindrome = true;

	for (int i = 0; i < word.length(); i++) {
	    if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
		isPalindrome = false;
	    }
	}

	return isPalindrome;
    }
}