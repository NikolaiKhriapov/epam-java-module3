package strings.string_as_char_array.task04;

/*
 * Задача 4. В строке найти количество чисел.
 */

public class View {
    private static Logic logic = new Logic();
    
    public void printNoOfNumbers(String message, String line) {
	System.out.print(message + logic.countNumbers(line));
    }
}