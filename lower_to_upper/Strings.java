import java.util.Scanner;
class Strings{
public static void main(String[] args) {
String str = "vtu25394";
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
int ascii = (int) ch;
System.out.println(ch + " : " + ascii);
}
}
}