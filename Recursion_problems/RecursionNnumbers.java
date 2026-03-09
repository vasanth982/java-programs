class RecursionNnumbers{
public static void main(String[] args){
printnos_rec(1);
}
static void printnos_rec(long i){
if(i>9){
return;
}
System.out.println(i);
i=i+1;
printnos_rec(i);
}
}
