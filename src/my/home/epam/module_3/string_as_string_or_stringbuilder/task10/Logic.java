package my.home.epam.module_3.string_as_string_or_stringbuilder.task10;

/*
 * Задача 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */

public class Logic {

    public int findNoOfSentences(String line) {
	String[] sentences = line.split("[.!?]");
	return sentences.length;
    }
}