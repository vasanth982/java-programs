class Solution3{
public int firstUniquechar(String s){
int[] freq=new int[26];
for(int i=0;i<s.length();i++){
freq[s.chatAt(i)-'a')++;
}
for(int i=0;i<s.length();i++){
if(freq[s.chatAt(i)-'a']==1){
return i;
}}
return -1;
}
public static void main(String[] args){
Solution3 obj = new Solution3();
String[] inputs = {"leetcode","loveleetcode","aabb"};
for(String input : inputs){
int result = obj.firstUniqchar(input);
System.out.println("Input:" +input);
System.out.println("First unique character index:"+ result);
if(result != -1){
System.out.println("Character: " +input.charAt(result));
}
else{
System.out.println("No unique character found");
}
System.out.println();
}
}
}