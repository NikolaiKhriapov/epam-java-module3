package my.home.epam.module_3.string_as_char_array.task03;

/*
* Задача 3. В строке найти количество цифр.
*/

public class View {
   private static Logic logic = new Logic();
   
   public void printNoOfDigits(String message, String line) {
	System.out.print(message + logic.countDigits(line));
   }
}