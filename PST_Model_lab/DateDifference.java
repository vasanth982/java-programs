import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class DateDifference{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String startStr=sc.nextLine();
String endStr=sc.nextLine();
DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
LocalDate startDate=LocalDate.parse(startStr,formatter);
LocalDate endDate=LocalDate.parse(endStr,formatter);
long daysBetween=Math.abs(ChronoUnit.DAYS.between(startDate,endDate));
long exclisiveDays=Math.max(0,daysBetween -1);
System.out.println(exclisiveDays +"days");
sc.close();
}
}