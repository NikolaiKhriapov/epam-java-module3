package strings.string_as_string_or_stringbuilder.task01;

/*
 * Задача 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Main {

    public static void main(String[] args) {
	View view = new View();

	String line = " fa adf6  df   ad6f ";

	view.printMaxNoOfSpaces("Наибольшее количество подряд идущих пробелов: ", line);
    }
}