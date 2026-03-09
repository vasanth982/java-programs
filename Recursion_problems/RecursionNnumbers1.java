class RecursionNnumbers1{
public static void main(String[] args){
printnos_rec(9);
}
static void printnos_rec(long i){
if(i<0){
return;
}
System.out.println(i);
i=i-1;
printnos_rec(i);
}
}
