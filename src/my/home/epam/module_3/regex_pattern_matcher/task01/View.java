package my.home.epam.module_3.regex_pattern_matcher.task01;

/*
 * Задача 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом 
 * три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать 
 * слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, 
 * а в случае равенства – по алфавиту.
 */

public class View {
    private static Logic logic = new Logic();

    public void printParagraphsBySentences(String text) {
	text = logic.sortParagraphsBySentences(text);
	System.out.println(text);
    }

    public void printWordsByLength(String text) {
	text = logic.sortWordsByLength(text);
	System.out.println(text);
    }

    public void printLexemesInSentences(String text, String letter) {
	text = logic.sortLexemesInSentences(text, letter);
	System.out.println(text);
    }
}