package strings.string_as_char_array.task02;

/*
 * ������ 2. �������� � ������ ��� ��������� 'word' �� 'letter'.
 */

public class Main {

    public static void main(String[] args) {
	View view = new View();
	Logic logic = new Logic();

	String line = "This sentence contains word1, word3 and wor";

	logic.checkIfContainsWord(line);

	view.printResultOfReplacement(line);
    }
}