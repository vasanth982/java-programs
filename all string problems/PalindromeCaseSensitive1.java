class PalindromeCaseSensitive1 {
public static void main(String[] args) {
isPalindrome();
}
static void isPalindrome() {
String str = "Amma";
String temp = "";
for (int i = str.length() - 1; i >= 0; i--) {
temp = temp + str.charAt(i);
}
int flag = 0;
for (int i = 0; i < str.length(); i++) {
if (str.charAt(i) == temp.charAt(i)) {
continue;
} else {
flag = 1;
break;
}
}
if (flag == 0) {
System.out.println("Palindrome");
} else {
System.out.println("Not Palindrome");
}
}
}