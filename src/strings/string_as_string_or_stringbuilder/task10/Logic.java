package strings.string_as_string_or_stringbuilder.task10;

/*
 * ������ 10. ������ X ������� �� ���������� �����������, ������ �� ������� ��������� ������, 
 * ��������������� ��� �������������� ������. ���������� ���������� ����������� � ������ X.
 */

public class Logic {

    public int findNoOfSentences(String line) {
	String[] sentences = line.split("[.!?]");
	return sentences.length;
    }
}