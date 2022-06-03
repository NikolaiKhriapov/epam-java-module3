package my.home.epam.module_3.string_as_string_or_stringbuilder.task09;

/*
 * Задача 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
 * Учитывать только английские буквы.
 * 
 * Пример: Line 01 For Checking The Conditions! Строка 01 Для Проверки Условия Задачи!
 */

public class Main {

    public static void main(String[] args) {
	Logic logic = new Logic();
	View view = new View();

	String line = logic.inputLine("Введите строку: ");

	System.out.println();
	
	view.printNoOfLowerCaseLetters(line);
	view.printNoOfUpperCaseLetters(line);
    }
}