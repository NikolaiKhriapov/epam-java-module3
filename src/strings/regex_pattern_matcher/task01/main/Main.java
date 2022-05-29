package strings.regex_pattern_matcher.task01.main;

import strings.regex_pattern_matcher.task01.logic.Logic;
import strings.regex_pattern_matcher.task01.view.View;

/*
 * ������ 1. C������ ����������, ����������� ����� (����� �������� � ������) � ����������� ��������� � ������� 
 * ��� ��������� ��������: ������������� ������ �� ���������� �����������; � ������ ����������� ������������� 
 * ����� �� �����; ������������� ������� � ����������� �� �������� ���������� ��������� ��������� �������, 
 * � � ������ ��������� � �� ��������.
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
	System.out.println("������ ����������:");
	System.out.println("1. ������������� ������ �� ���������� �����������");
	System.out.println("2. � ������ ����������� ������������� ����� �� �����");
	System.out.println("3. ������������� ������� � �����������");
	System.out.println();
    }

    private static void initActions(String text, Logic logic, View view) {
	switch (logic.inputNumber("������� �����: ")) {
	case 1 -> view.printParagraphsBySentences(text);
	case 2 -> view.printWordsByLength(text);
	case 3 -> view.printLexemesInSentences(text, logic.inputLetter("������� �����: "));
	default -> initActions(text, logic, view);
	}
    }
}