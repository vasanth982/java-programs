import java.util.Scanner;
class PalindromeCaseSensitive {
public static void main(String[] args) {
PalindromeCaseSensitive obj = new PalindromeCaseSensitive();
obj.palindrome();
}
void palindrome() {
Scanner scan = new Scanner(System.in);
String str = "ram";        
String temp = "";
int i = str.length() - 1;
while (i >= 0) {
temp = temp + str.charAt(i);            
i--;
}
if (str.equals(temp)) {
System.out.println("palindrome(CaseSensitive)");
} 
else {
System.out.println("not a palindrome(CaseSensitive)");
}
}
}