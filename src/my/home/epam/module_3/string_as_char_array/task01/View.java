package my.home.epam.module_3.string_as_char_array.task01;

/*
 * Задача 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
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