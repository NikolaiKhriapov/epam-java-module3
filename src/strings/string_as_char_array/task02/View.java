package strings.string_as_char_array.task02;

/*
 * ������ 2. �������� � ������ ��� ��������� 'word' �� 'letter'.
 */

public class View {
    private static Logic logic = new Logic();

    public void printResultOfReplacement(String lineWithWord) {
	String lineWithLetter = logic.replaceWordWithLetter(lineWithWord);
	System.out.println(lineWithLetter);
    }
}