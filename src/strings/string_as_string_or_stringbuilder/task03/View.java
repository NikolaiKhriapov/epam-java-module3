package strings.string_as_string_or_stringbuilder.task03;

/*
 * Задача 3. Проверить, является ли заданное слово палиндромом.
 */

public class View {
    private static Logic logic = new Logic();

    public void checkIfPalindrome(String word) {
	if (logic.isPalindrome(word)) {
	    System.out.println("Слово " + word + " является палиндромом");
	} else {
	    System.out.println("Слово " + word + " не является палиндромом");
	}
    }
}