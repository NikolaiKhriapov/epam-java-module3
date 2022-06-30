package my.home.epam.module_3.regex_pattern_matcher.task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Дана строка, содержащая следующий текст (xml-документ):
 * 
 * <notes>
 *   <note id = "1">
 *     <to>Вася</to>
 *     <from>Света</from>
 *     <heading>Напоминание</heading>
 *     <body>Позвони мне завтра!</body>
 *   </note>
 *   <note id = "2">
 *     <to>Петя</to>
 *     <from>Маша</from>
 *     <heading>Важное напоминание</heading>
 *     <body/>
 *   </note>
 * </notes>
 * 
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег, 
 * закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class Logic {

    public void analyzeXml(String xml) {
	String[] xmlLines = xml.split("\\r\\n");
	for (String line : xmlLines) {
	    analizeXmlLine(line);
	}
    }

    public void analizeXmlLine(String line) {
	String regexOpeningTag = "<\\w+>$";
	String regexClosingTag = "</\\w+>$";
	String regexAttributeOpeningTag = "(<\\w+)(\\s+)(\\w+)(\\s+=\\s+\")(.*)(\">)";
	String regexTagContent = "(<.+>)(.*)(</.+>)";
	String regexEmptyTag = "<\\w+/>";

	Pattern patternTag = Pattern.compile(regexTagContent);
	Matcher matcherTag = patternTag.matcher(line.trim());
	if (matcherTag.find()) {
	    System.out.print(matcherTag.group(1) + " - открывающий тег, ");
	    System.out.print(matcherTag.group(2) + " - содержимое тега, ");
	    System.out.println(matcherTag.group(3) + " - закрывающий тег");
	} else {
	    Pattern patternOpeningTag = Pattern.compile(regexOpeningTag);
	    Matcher matcherOpeningTag = patternOpeningTag.matcher(line.trim());
	    if (matcherOpeningTag.find()) {
		System.out.println(matcherOpeningTag.group() + " - открывающий тег");
	    }

	    Pattern patternClosingTag = Pattern.compile(regexClosingTag);
	    Matcher matcherClosingTag = patternClosingTag.matcher(line.trim());
	    if (matcherClosingTag.find()) {
		System.out.println(matcherClosingTag.group() + " - закрывающий тег");
	    }

	    Pattern patternAttributeOpeningTag = Pattern.compile(regexAttributeOpeningTag);
	    Matcher matcherAttributeOpeningTag = patternAttributeOpeningTag.matcher(line.trim());
	    if (matcherAttributeOpeningTag.find()) {
		System.out.print(matcherAttributeOpeningTag.group() + " - открывающий тег c атрибутом");
		System.out.print(", атрибут: " + matcherAttributeOpeningTag.group(3));
		System.out.println(", значение: " + matcherAttributeOpeningTag.group(5));
	    }

	    Pattern patternEmptyTag = Pattern.compile(regexEmptyTag);
	    Matcher matcherEmptyTag = patternEmptyTag.matcher(line.trim());
	    if (matcherEmptyTag.find()) {
		System.out.println(matcherEmptyTag.group() + " - тег без тела");
	    }
	}
    }
}