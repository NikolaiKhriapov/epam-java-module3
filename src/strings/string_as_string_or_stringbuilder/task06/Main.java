package strings.string_as_string_or_stringbuilder.task06;

/*
 * Задача 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Main {

    public static void main(String[] args) {

	String sourceLine = "Наукой, изучающей предложение, является синтаксис.";

	StringBuilder resultLineSB = new StringBuilder();

	for (int i = 0; i < sourceLine.length(); i++) {
	    resultLineSB.append(sourceLine.charAt(i)).append(sourceLine.charAt(i));
	}
	
	System.out.println(String.valueOf(resultLineSB));
    }
}