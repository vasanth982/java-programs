class FactorialRecursion{
public static void main(String[] args){
System.out.println(fact_rec(5));
}
static long fact_rec(long num){
if(num<=1){
return 1;
}
else{
return num*fact_rec(num-1);
}
}
}