package strings.string_as_char_array.task01;

/*
 * ������ 1. ��� ������ �������� ���������� � camelCase. ������������� �������� � snake_case.
 */

public class Main {
    
    public static void main(String[] args) {
	Logic logic = new Logic();
	View view = new View();
	
	String[] stringArray = new String[] { "stringOne", "stringTwo", "stringThree", "stringFour", "stringNumberFive" };
	
	logic.checkCamelCase(stringArray);
	
	view.printAllCamelToSnake(stringArray);
    }
}