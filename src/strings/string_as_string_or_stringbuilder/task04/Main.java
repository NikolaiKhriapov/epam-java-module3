package strings.string_as_string_or_stringbuilder.task04;

/*
 * ������ 4. � ������� ������� ����������� � �������� ������������ ��������� �� ������ ����� ������������� ����� �����.
 */

public class Main {

    public static void main(String[] args) {
	
	String sourceWord = "�����������";
	
	System.out.println(String.copyValueOf(sourceWord.toCharArray()).charAt(7) + sourceWord.substring(3, 5) + sourceWord.charAt(7));
    }
}