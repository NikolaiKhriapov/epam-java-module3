package my.home.epam.module_3.string_as_char_array.task02;

/*
 * Задача 2. Замените в строке все вхождения 'word' на 'letter'.
 */

public class Logic {

    public String replaceWordWithLetter(String line) {
	do {
	    String letter = "letter";
	    char[] letterArray = letter.toCharArray();

	    char[] charArray = line.toCharArray();
	    char[] newCharArray = new char[charArray.length + 2];

	    int index = 0;
	    for (int i = 0; i < charArray.length - 3; i++) {
		if (charArray[i] == 'w') {
		    if (charArray[i + 1] == 'o') {
			if (charArray[i + 2] == 'r') {
			    if (charArray[i + 3] == 'd') {
				index = i;
			    }
			}
		    }
		}
	    }

	    for (int i = 0; i < index; i++) {
		newCharArray[i] = charArray[i];
	    }
	    for (int i = index; i < index + letterArray.length; i++) {
		newCharArray[i] = letterArray[i - index];
	    }
	    for (int i = index + letterArray.length; i < newCharArray.length; i++) {
		newCharArray[i] = charArray[i - 2];
	    }

	    line = String.valueOf(newCharArray);
	} while (!isWithoutWord(line));

	return line;
    }

    public boolean isWithoutWord(String line) {
	char[] charArray = line.toCharArray();

	boolean isWithoutWord = true;

	for (int i = 0; i < charArray.length - 3; i++) {
	    if (charArray[i] == 'w') {
		if (charArray[i + 1] == 'o') {
		    if (charArray[i + 2] == 'r') {
			if (charArray[i + 3] == 'd') {
			    isWithoutWord = false;
			}
		    }
		}
	    }
	}

	return isWithoutWord;
    }

    public void checkIfContainsWord(String line) {
	if (isWithoutWord(line)) {
	    System.out.println("Error! The line doesn't contain 'word'!");
	    System.exit(0);
	}
    }
}