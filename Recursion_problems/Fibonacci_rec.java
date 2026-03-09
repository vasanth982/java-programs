class Fibonacci_rec{
public static void main(String[] args){
for(int i=1;i<=9;i++){
System.out.println(Fibonacci(i)+" ");
}
System.out.println();
}
static int Fibonacci(int num){
if(num==1||num==2){
return 1;
}
return Fibonacci(num-1)+Fibonacci(num-2);
}
}