import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
public class WordCotgozier{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
String sentence=sc.nextLine();
String[] words =sentence.split("\\s+");
String result=Arrays.stream(words).map(word -> word.length() <=5 ? "short":"long").collect(Collectors.joining(" "));
System.out.println(result);
sc.close();
}
}