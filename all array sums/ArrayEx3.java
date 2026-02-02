class ArrayEx3{
public static void main(String[] args){
createArray();
}
static void createArray(){
int arr[]=new int[6];
arr[0]=48;
arr[1]=88;
arr[2]=69;
for(int i=0;i<=arr.length;i++){
System.out.println(arr[i]);
}
}
}