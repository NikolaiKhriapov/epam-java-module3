package strings.string_as_char_array.task01;

/*
 * ������ 1. ��� ������ �������� ���������� � camelCase. ������������� �������� � snake_case.
 */

public class View {
    private static Logic logic = new Logic();
    
    public void printAllCamelToSnake(String[] camelArray) {
	String[] snakeArray = logic.changeAllCamelToSnake(camelArray);
	for (String oneString : snakeArray) {
	    System.out.println(oneString);
	}
    }
}