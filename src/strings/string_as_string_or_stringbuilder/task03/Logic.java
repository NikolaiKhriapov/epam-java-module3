package strings.string_as_string_or_stringbuilder.task03;

/*
 * ������ 3. ���������, �������� �� �������� ����� �����������.
 */

public class Logic {

    public boolean isPalindrome(String word) {
	word = word.toLowerCase();

	boolean isPalindrome = true;

	for (int i = 0; i < word.length(); i++) {
	    if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
		isPalindrome = false;
	    }
	}

	return isPalindrome;
    }
}