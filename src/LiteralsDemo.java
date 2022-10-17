public class LiteralsDemo {

  public static void main(String[] args) {
    char sq = '\'';
    char dq ='\"';
    char bksl = '\\';
    char cr = '\r';
    char nl = '\n';
    char ff = '\f';
    char ht = '\t';
    char bs = '\b';
    char octalI = '\111';
    char hexay = '\u00FF';

    System.out.println("First Line\nSecond Line");
    System.out.println("Single Quote: " + sq + "\n"
        + "Double Quote: " + dq +"\n"
        + "Backslash: " + bksl + "\n"
        + "Carriage Return" + cr +"see\n"
        + "New Line: " + nl + "see?\n"
        + "Form Feed:" + ff + "feed\n"
        + "Horizontal tab:" + ht + "see?\n"
        + "Backspace: " + bs +"spaced back\n"
        + "Octal 111: " + octalI + "\n"
        + "Hexa 00FF: " + hexay + "\n");
    System.out.println("Tab Demo\nA\tB\tC\nD\tE\tF");

  }
}