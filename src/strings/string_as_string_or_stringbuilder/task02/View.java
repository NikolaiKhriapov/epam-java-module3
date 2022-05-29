package strings.string_as_string_or_stringbuilder.task02;

/*
 * Задача 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class View {
    private static Logic logic = new Logic();

    public void amendedLine(String line) {
	System.out.println(logic.putBAfterA(line));
    }
}