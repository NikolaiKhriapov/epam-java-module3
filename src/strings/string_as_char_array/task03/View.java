package strings.string_as_char_array.task03;

/*
* ������ 3. � ������ ����� ���������� ����.
*/

public class View {
   private static Logic logic = new Logic();
   
   public void printNoOfDigits(String message, String line) {
	System.out.print(message + logic.countDigits(line));
   }
}