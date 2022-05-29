package strings.regex_pattern_matcher.task01;

/*
 * ������ 1. C������ ����������, ����������� ����� (����� �������� � ������) � ����������� ��������� � ������� 
 * ��� ��������� ��������: ������������� ������ �� ���������� �����������; � ������ ����������� ������������� 
 * ����� �� �����; ������������� ������� � ����������� �� �������� ���������� ��������� ��������� �������, 
 * � � ������ ��������� � �� ��������.
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