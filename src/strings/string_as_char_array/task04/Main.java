package strings.string_as_char_array.task04;

/*
 * Задача 4. В строке найти количество чисел.
 */

public class Main {
    
    public static void main(String[] args) {
	View view = new View();
	
	String line = "g4ad684a9d4a65d46ad4";
	
	view.printNoOfNumbers("Количество чисел в строке: ", line);
    }
}