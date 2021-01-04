import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  Дана строка, содержащая следующий текст (xml-документ):
  <notes>
     <note id = "1">
        <to>Вася</to>
        <from>Света</from>
        <heading>Напоминание</heading>
        <body>Позвони мне завтра!</body>
     </note>
     <note id = "2">
         <to>Петя</to>
         <from>Маша</from>
         <heading>Важное напоминание</heading>
         <body/>
     </note>
  </notes>
  Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
  xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
  тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class String17 {
    public static void main (String [] args){
        String xmlDoc = "<notes>\n" +
                "        <note id = \"1\">\n" +
                "            <to>Вася</to>\n" +
                "            <from>Света</from>\n" +
                "            <heading>Напоминание</heading>\n" +
                "            <body>Позвони мне завтра!</body>\n" +
                "        </note>\n" +
                "        <note id = \"2\">\n" +
                "            <to>Петя</to>\n" +
                "            <from>Маша</from>\n" +
                "            <heading>Важное напоминание</heading>\n" +
                "            <body/>\n" +
                "        </note>\n" +
                "     </notes>";
        String parcer = xmlReader(xmlDoc);
        System.out.print(parcer);
    }


    private static String xmlReader (String xml){
        StringBuilder result = new StringBuilder();

        Pattern opened = Pattern.compile("<\\w.+?>");
        Pattern closed = Pattern.compile("</\\w+>");
        Pattern content = Pattern.compile(">.+?<");
        Pattern withoutContent = Pattern.compile("<\\w.+?/>");

        String [] rows = xml.split("\n");

        for (String row : rows) {

            Matcher mOpened = opened.matcher(row);
            Matcher mClosed = closed.matcher(row);
            Matcher mContent = content.matcher(row);
            Matcher mWithoutContent = withoutContent.matcher(row);

            if(mWithoutContent.find()){
                result.append(mWithoutContent.group());
                result.append("\n");
            }
            else if(mOpened.find()){
                result.append(mOpened.group());
                result.append("\n");
            }
            if(mContent.find()){
                result.append(mContent.group());
                result.append("\b");
            }
            if(mClosed.find()){
                result.append(mClosed.group());
                result.append("\n");
            }
        }
        return result.toString();
    }
}

