package strings.regex_pattern_matcher.task01.logic;

import java.util.Scanner;

import strings.regex_pattern_matcher.task01.database.Database;

/*
 * «адача 1. Cоздать приложение, разбирающее текст (текст хранитс€ в строке) и позвол€ющее выполн€ть с текстом 
 * три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать 
 * слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, 
 * а в случае равенства Ц по алфавиту.
 */

public class Logic {
    private static Database database = new Database();

    public String initText() {
	return database.getText();
    }

    public int inputNumber(String message) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print(message);
	while (!scanner.hasNextInt()) {
	    System.out.print(message);
	    scanner.next();
	}
	return scanner.nextInt();
    }

    // 1. ќтсортировать абзацы по количеству предложений
    public String sortParagraphsBySentences(String text) {
	String[] paragraphs = text.split("\r\n\r\n");
	for (int i = 0; i < paragraphs.length - 1; i++) {
	    for (int j = i + 1; j < paragraphs.length; j++) {
		if (paragraphs[i].split("\n").length > paragraphs[j].split("\n").length) {
		    String temp = paragraphs[i];
		    paragraphs[i] = paragraphs[j];
		    paragraphs[j] = temp;
		}
	    }
	}

	StringBuilder stringBuilder = new StringBuilder();
	for (String paragraph : paragraphs) {
	    stringBuilder.append(paragraph + "\r\n\r\n");
	}

	return String.valueOf(stringBuilder).trim();
    }

    // 2. ¬ каждом предложении отсортировать слова по длине
    public String sortWordsByLength(String text) {
	String[] paragraphs = text.split("\r\n\r\n");
	StringBuilder stringBuilder3 = new StringBuilder();
	for (String paragraph : paragraphs) {
	    stringBuilder3.append(processSentencesInParagraph3(paragraph) + "\r\n\r\n");
	}
	return String.valueOf(stringBuilder3).trim();
    }

    private static String processSentencesInParagraph3(String paragraph) {
	String[] sentences = paragraph.split("\n");
	StringBuilder stringBuilder2 = new StringBuilder();
	for (int i = 0; i < sentences.length; i++) {
	    stringBuilder2.append(processWordsInSentence3(sentences[i]) + " \n");
	}
	return String.valueOf(stringBuilder2).trim();
    }

    private static String processWordsInSentence3(String sentence) {
	sentence = sentence.replaceAll(" Ч ", " ");
	sentence = sentence.replaceAll("[[\\p{Punct}ЕЂї]&&[^-]]", "");

	String[] words = sentence.split(" ");

	for (int i = 0; i < words.length - 1; i++) {
	    for (int j = i + 1; j < words.length; j++) {
		if (words[i].length() > words[j].length()) {
		    String temp = words[i];
		    words[i] = words[j];
		    words[j] = temp;
		}
	    }
	}

	StringBuilder stringBuilder1 = new StringBuilder();
	for (String word : words) {
	    stringBuilder1.append(word + " ");
	}
	return String.valueOf(stringBuilder1).trim();
    }

    // 3. ќтсортировать лексемы в предложении
    public String sortLexemesInSentences(String text, String letter) {
	String[] paragraphs = text.split("\r\n\r\n");
	StringBuilder stringBuilder3 = new StringBuilder();
	for (String paragraph : paragraphs) {
	    stringBuilder3.append(processSentencesInParagraph4(paragraph, letter) + "\r\n\r\n");
	}
	return String.valueOf(stringBuilder3).trim();
    }

    private static String processSentencesInParagraph4(String paragraph, String letter) {
	String[] sentences = paragraph.split("\n");
	StringBuilder stringBuilder2 = new StringBuilder();
	for (int i = 0; i < sentences.length; i++) {
	    stringBuilder2.append(processWordsInSentence4(sentences[i], letter) + " \n");
	}
	return String.valueOf(stringBuilder2).trim();
    }

    private static String processWordsInSentence4(String sentence, String letter) {
	sentence = sentence.replaceAll(" Ч ", " ");
	sentence = sentence.replaceAll("[[\\p{Punct}ЕЂї]&&[^-]]", "");

	String[] words = sentence.split(" ");

	for (int i = 0; i < words.length - 1; i++) {
	    for (int j = i + 1; j < words.length; j++) {
		if (findNoOfLettersContained(words[i], letter) < findNoOfLettersContained(words[j], letter)) {
		    String temp = words[i];
		    words[i] = words[j];
		    words[j] = temp;
		} else if (findNoOfLettersContained(words[i], letter) == findNoOfLettersContained(words[j], letter)) {
		    if (words[i].compareTo(words[j]) > 0) {
			String temp = words[i];
			words[i] = words[j];
			words[j] = temp;
		    }
		}
	    }
	}

	StringBuilder stringBuilder1 = new StringBuilder();
	for (String word : words) {
	    stringBuilder1.append(word + " ");
	}
	return String.valueOf(stringBuilder1).trim();
    }

    private static int findNoOfLettersContained(String word, String letter) {
	int noOfLettersContained = 0;
	for (int i = 0; i < word.length(); i++) {
	    if (word.charAt(i) == letter.charAt(0)) {
		noOfLettersContained++;
	    }
	}

	return noOfLettersContained;
    }

    public String inputLetter(String message) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print(message);
	while (!scanner.hasNextLine()) {
	    System.out.print(message);
	    scanner.next();
	}

	System.out.println();

	return scanner.nextLine();
    }
}