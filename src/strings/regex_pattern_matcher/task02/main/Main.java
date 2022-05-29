package strings.regex_pattern_matcher.task02.main;

import strings.regex_pattern_matcher.task02.logic.Logic;

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

public class Main {

    public static void main(String[] args) {
	String xml = "<notes>\r\n" + "<note id = \"1\">\r\n" + "<to>Вася</to>\r\n" + "<from>Света</from>\r\n" + "<heading>Напоминание</heading>\r\n"
		+ "<body>Позвони мне завтра!</body>\r\n" + "</note>\r\n" + "<note id = \"2\">\r\n" + "<to>Петя</to>\r\n" + "<from>Маша</from>\r\n"
		+ "<heading>Важное напоминание</heading>\r\n" + "<body/>\r\n" + "</note>\r\n" + "</notes>";

	Logic logic = new Logic();

	logic.analyzeXml(xml);
    }
}