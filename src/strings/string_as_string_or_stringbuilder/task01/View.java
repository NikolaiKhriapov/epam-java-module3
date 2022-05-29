package strings.string_as_string_or_stringbuilder.task01;

/*
 * Задача 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class View {
    private static Logic logic = new Logic();

    public void printMaxNoOfSpaces(String message, String line) {
	System.out.println(message + logic.findMaxNoOfSpaces(line));
    }
}