class StringBuilderPalindrome{
public static void main(String[] args){
isPalindrome();
}
static void isPalindrome(){
String str = new String("Amma");
StringBuilder sb =new StringBuilder(str);
sb=sb.reverse();
String temp = sb.toString();
if(str.equals(temp)){
System.out.println(str+" is palindrome");
}
else{
System.out.println(str+" is not a palindrome");
}
}
}