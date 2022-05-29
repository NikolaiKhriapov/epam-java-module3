package strings.string_as_char_array.task01;

/*
 * Задача 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Logic {

    public boolean isCamelCase(String string) {
	char[] charArray = string.toCharArray();

	boolean isCamelCase = false;
	for (char oneChar : charArray) {
	    if (Character.isUpperCase(oneChar)) {
		isCamelCase = true;
	    }
	}

	return isCamelCase;
    }

    public boolean isArrayOfCamelCase(String[] stringArray) {
	boolean isArrayOfCamelCase = true;
	for (String oneString : stringArray) {
	    if (!isCamelCase(oneString)) {
		isArrayOfCamelCase = false;
	    }
	}
	return isArrayOfCamelCase;
    }

    public void checkCamelCase(String[] stringArray) {
	if (!isArrayOfCamelCase(stringArray)) {
	    System.out.println("Ошибка! Как минимум 1 элемент массива указан не в camelCase.");
	    System.exit(0);
	}
    }

    public String changeOneCamelToSnake(String string) {
	do {
	    char[] camelArray = string.toCharArray();
	    char[] snakeArray = new char[camelArray.length + 1];

	    int index = 0;
	    for (int i = 0; i < camelArray.length; i++) {
		if (Character.isUpperCase(camelArray[i])) {
		    Character.toLowerCase(camelArray[i]);
		    index = i;
		    continue;
		}
	    }

	    for (int i = 0; i < snakeArray.length; i++) {
		if (i < index) {
		    snakeArray[i] = camelArray[i];
		} else if (i == index) {
		    snakeArray[i] = '_';
		} else if (i > index) {
		    snakeArray[i] = Character.toLowerCase(camelArray[i - 1]);
		}
	    }
	    string = String.valueOf(snakeArray);
	} while (isCamelCase(string));

	return string;
    }

    public String[] changeAllCamelToSnake(String[] camelArray) {
	String[] snakeArray = new String[camelArray.length];
	for (int i = 0; i < snakeArray.length; i++) {
	    snakeArray[i] = changeOneCamelToSnake(camelArray[i]);
	}
	return snakeArray;
    }
}