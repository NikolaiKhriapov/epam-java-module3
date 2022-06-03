package my.home.epam.module_3.string_as_char_array.task03;

/*
* Задача 3. В строке найти количество цифр.
*/

public class Main {
    public static void main(String[] args) {
	View view = new View();
	
	String line = "shaf4g6adf4gs6";
	
	view.printNoOfDigits("В строке содержится цифр: ", line);
    }
}