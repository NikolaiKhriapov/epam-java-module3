package strings.regex_pattern_matcher.task02.main;

import strings.regex_pattern_matcher.task02.logic.Logic;

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

public class Main {

    public static void main(String[] args) {
	String xml = "<notes>\r\n" + "<note id = \"1\">\r\n" + "<to>����</to>\r\n" + "<from>�����</from>\r\n" + "<heading>�����������</heading>\r\n"
		+ "<body>������� ��� ������!</body>\r\n" + "</note>\r\n" + "<note id = \"2\">\r\n" + "<to>����</to>\r\n" + "<from>����</from>\r\n"
		+ "<heading>������ �����������</heading>\r\n" + "<body/>\r\n" + "</note>\r\n" + "</notes>";

	Logic logic = new Logic();

	logic.analyzeXml(xml);
    }
}