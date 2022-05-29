package strings.regex_pattern_matcher.task01.main;

import strings.regex_pattern_matcher.task01.logic.Logic;
import strings.regex_pattern_matcher.task01.view.View;

/*
 * Задача 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом 
 * три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать 
 * слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, 
 * а в случае равенства – по алфавиту.
 */

public class Main {
    public static void main(String[] args) {
	Logic logic = new Logic();
	View view = new View();

	String text = logic.initText();
	System.out.println(text + "\n");

	printActions();

	initActions(text, logic, view);
    }

    private static void printActions() {
	System.out.println("Панель управления:");
	System.out.println("1. Отсортировать абзацы по количеству предложений");
	System.out.println("2. В каждом предложении отсортировать слова по длине");
	System.out.println("3. Отсортировать лексемы в предложении");
	System.out.println();
    }

    private static void initActions(String text, Logic logic, View view) {
	switch (logic.inputNumber("Введите число: ")) {
	case 1 -> view.printParagraphsBySentences(text);
	case 2 -> view.printWordsByLength(text);
	case 3 -> view.printLexemesInSentences(text, logic.inputLetter("Введите букву: "));
	default -> initActions(text, logic, view);
	}
    }
}