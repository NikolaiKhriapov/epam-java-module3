package strings.regex_pattern_matcher.task02.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ���� ������, ���������� ��������� ����� (xml-��������):
 * 
 * <notes>
 *   <note id = "1">
 *     <to>����</to>
 *     <from>�����</from>
 *     <heading>�����������</heading>
 *     <body>������� ��� ������!</body>
 *   </note>
 *   <note id = "2">
 *     <to>����</to>
 *     <from>����</from>
 *     <heading>������ �����������</heading>
 *     <body/>
 *   </note>
 * </notes>
 * 
 * �������� ����������, ����������� ��������������� ���������� ���������� ����� xml-��������� � ��� ��� (����������� ���, 
 * ����������� ���, ���������� ����, ��� ��� ����). ������������ �������� ��������� XML ��� ������� ������ ������ ������.
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
	    System.out.print(matcherTag.group(1) + " - ����������� ���, ");
	    System.out.print(matcherTag.group(2) + " - ���������� ����, ");
	    System.out.println(matcherTag.group(3) + " - ����������� ���");
	} else {
	    Pattern patternOpeningTag = Pattern.compile(regexOpeningTag);
	    Matcher matcherOpeningTag = patternOpeningTag.matcher(line.trim());
	    if (matcherOpeningTag.find()) {
		System.out.println(matcherOpeningTag.group() + " - ����������� ���");
	    }

	    Pattern patternClosingTag = Pattern.compile(regexClosingTag);
	    Matcher matcherClosingTag = patternClosingTag.matcher(line.trim());
	    if (matcherClosingTag.find()) {
		System.out.println(matcherClosingTag.group() + " - ����������� ���");
	    }

	    Pattern patternAttributeOpeningTag = Pattern.compile(regexAttributeOpeningTag);
	    Matcher matcherAttributeOpeningTag = patternAttributeOpeningTag.matcher(line.trim());
	    if (matcherAttributeOpeningTag.find()) {
		System.out.print(matcherAttributeOpeningTag.group() + " - ����������� ��� c ���������");
		System.out.print(", �������: " + matcherAttributeOpeningTag.group(3));
		System.out.println(", ��������: " + matcherAttributeOpeningTag.group(5));
	    }

	    Pattern patternEmptyTag = Pattern.compile(regexEmptyTag);
	    Matcher matcherEmptyTag = patternEmptyTag.matcher(line.trim());
	    if (matcherEmptyTag.find()) {
		System.out.println(matcherEmptyTag.group() + " - ��� ��� ����");
	    }
	}
    }
}