package strings.string_as_string_or_stringbuilder.task04;

/*
 * Задача 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Main {

    public static void main(String[] args) {
	
	String sourceWord = "Информатика";
	
	System.out.println(String.copyValueOf(sourceWord.toCharArray()).charAt(7) + sourceWord.substring(3, 5) + sourceWord.charAt(7));
    }
}