class StringBuilderPalindrome2{
public static void main(String[] args){
isPalindrome();
}
static void isPalindrome(){
String str = new String("Amma");
String temp = new StringBuilder(str).reverse().toString();
if(str.equals(temp)){
System.out.println(str+" is palindrome");
}
else{
System.out.println(str+" is not a palindrome");
}
}
}