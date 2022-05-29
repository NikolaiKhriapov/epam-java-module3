package strings.string_as_string_or_stringbuilder.task10;

/*
 * Задача 10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 */

public class View {
    private static Logic logic = new Logic();

    public void printNoOfSentences(String message, String line) {
	System.out.print(message);
	System.out.println(logic.findNoOfSentences(line));
    }
}