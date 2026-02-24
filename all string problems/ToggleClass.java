class ToggleClass{
public static void main(String[] args) {
toToggle();
}
static void toToggle() {
String str = "Vasanth123#";
String temp = "";
int leng = str.length();
int i = 0;
while (i < leng) {
char ch = str.charAt(i);
if (Character.isLowerCase(ch)) {
temp = temp + Character.toUpperCase(ch);
} 
else if (Character.isUpperCase(ch)) {
temp = temp + Character.toLowerCase(ch);
} 
else {
temp = temp + ch;
}
i++;
}
System.out.println("Original String: " + str);
System.out.println("Converted String: " + temp);
}
}