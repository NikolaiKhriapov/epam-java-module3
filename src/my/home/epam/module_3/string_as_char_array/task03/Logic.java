package my.home.epam.module_3.string_as_char_array.task03;

/*
* Задача 3. В строке найти количество цифр.
*/

public class Logic {

    public int countDigits(String line) {
	char[] charArray = line.toCharArray();
	
	int digitCount = 0;
	for (char oneChar : charArray) {
	    if (Character.isDigit(oneChar)) {
		digitCount++;
	    }
	}
	return digitCount;
    }
}