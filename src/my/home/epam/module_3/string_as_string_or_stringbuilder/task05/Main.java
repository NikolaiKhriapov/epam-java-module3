package my.home.epam.module_3.string_as_string_or_stringbuilder.task05;

/*
 * Задача 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Main {

    public static void main(String[] args) {

	char givenChar = 'а';
	String line = "Наукой, изучающей предложение, является синтаксис.";

	int aCount = 0;
	for (int i = 0; i < line.length(); i++) {
	    if (line.charAt(i) == givenChar) {
		aCount++;
	    }
	}

	System.out.println("Буква \"" + givenChar + "\" встречается " + aCount + " раз(а).");
    }
}