import java.util.Scanner;
class Lower2Upper{
public static void main(String[] args){
Lower2Upper obj=new Lower2Upper();
obj.convert2Upper();
}
void convert2Upper(){
Scanner scan=new Scanner(System.in);
String str="Amma";
String temp="";
int i=0;
while(i<str.length()){
int asci=str.charAt(i);
if(asci>96&&asci<123){
int t=asci-32;
char ch=(char)t;
System.out.println(ch);
}
else{
System.out.println(str.charAt(i));
}
i++;
}
}
}