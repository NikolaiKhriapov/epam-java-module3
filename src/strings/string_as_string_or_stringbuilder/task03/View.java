package strings.string_as_string_or_stringbuilder.task03;

/*
 * ������ 3. ���������, �������� �� �������� ����� �����������.
 */

public class View {
    private static Logic logic = new Logic();

    public void checkIfPalindrome(String word) {
	if (logic.isPalindrome(word)) {
	    System.out.println("����� " + word + " �������� �����������");
	} else {
	    System.out.println("����� " + word + " �� �������� �����������");
	}
    }
}