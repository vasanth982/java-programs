class PalindromeCaseInSensitive {
public static void main(String[] args) {
ispalindrome();
}
static void ispalindrome(){
String str = "Amma"; 
str=str.toLowerCase();       
String temp = "";


for(int i = str.length() - 1;i >= 0;i--){
temp = temp + str.charAt(i);            

}
int flag=0;
for (int i=0;i<str.length();i++){
if(str.charAt(i)==temp.charAt(i)){
continue;
}
else{
flag=1;
break;
}
}
if(flag==0){
System.out.println("palindrome");
} 
else {
System.out.println("not a palindrome");
}
}
}