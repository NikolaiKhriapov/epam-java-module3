package my.home.epam.module_3.string_as_string_or_stringbuilder.task03;

/*
 * Задача 3. Проверить, является ли заданное слово палиндромом.
 */

public class View {
    private static Logic logic = new Logic();

    public void checkIfPalindrome(String word) {
	if (logic.isPalindrome(word)) {
	    System.out.println("The word \"" + word + "\" is a palindrome");
	} else {
	    System.out.println("The word \"" + word + "\" is not a palindrome");
	}
    }
}