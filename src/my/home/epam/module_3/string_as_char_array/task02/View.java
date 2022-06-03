package my.home.epam.module_3.string_as_char_array.task02;

/*
 * Задача 2. Замените в строке все вхождения 'word' на 'letter'.
 */

public class View {
    private static Logic logic = new Logic();

    public void printResultOfReplacement(String lineWithWord) {
	String lineWithLetter = logic.replaceWordWithLetter(lineWithWord);
	System.out.println(lineWithLetter);
    }
}