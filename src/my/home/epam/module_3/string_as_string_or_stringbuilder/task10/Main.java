package my.home.epam.module_3.string_as_string_or_stringbuilder.task10;

/*
 * Задача 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */

public class Main {

    public static void main(String[] args) {
	View view = new View();

	String line = "Предложение № 1. Предложение № 2! Предложение № 3? Предложение № 4.";

	view.printNoOfSentences("Количество предложений в строке: ", line);
    }
}