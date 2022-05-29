package strings.string_as_string_or_stringbuilder.task02;

/*
 * Задача 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Main {

    public static void main(String[] args) {
	View view = new View();

	String line = "Joe waited for the train. The train was late.";

	view.amendedLine(line);
    }
}