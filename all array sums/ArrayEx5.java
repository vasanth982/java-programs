class ArrayEx5{
public static void main(String[] args){
createArray();
}
static void createArray(){
int arr[]=new int[]{22,33,44,534};
int val1=22;
for(int i=0;i<arr.length;i++){
if(arr[i]==val1){
System.out.println("valu found");
}
System.out.println(i);
}
}
}