
class LowerToUpper2{
public static void main(String[] args){

String str = "amma";
String temp= " ";
int i=0;
while(i<str.length()){
int asci=str.charAt(i);
if(asci>96&&asci<123){
int t = asci-32;
char ch = (char)t;
System.out.println(ch);
}
else{
System.out.println(str.charAt(i));
}
i++;
}
}
}