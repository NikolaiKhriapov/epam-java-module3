package strings.string_as_string_or_stringbuilder.task09;

/*
 * Задача 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
 * Учитывать только английские буквы.
 * 
 * Пример: Line 01 For Checking The Conditions! Строка 01 Для Проверки Условия Задачи!
 */

public class View {
    private static Logic logic = new Logic();

    public void printNoOfLowerCaseLetters(String line) {
	System.out.println("Количество строчных букв: " + logic.findNoOfLowerCaseLetters(line));
    }

    public void printNoOfUpperCaseLetters(String line) {
	System.out.println("Количество прописных букв: " + logic.findNoOfUpperCaseLetters(line));
    }
}