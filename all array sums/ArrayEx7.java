class ArrayEx7{
public static void main(String[] args){
charArray();
}
static void charArray(){
int arr[]=new int[]{22,33,44,534};
int val1=22;
for(int i=arr.length-1;i>=0;i--){
if(arr[i]==val1){
System.out.println("value found");
break;
}
System.out.println(arr[i]);
}
}
}