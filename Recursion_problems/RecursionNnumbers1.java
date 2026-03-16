class RecursionNnumbers1{
public static void main(String[] args){
print(9);
}
static void print(long i){
if(i<=0){
return;
}
System.out.println(i);
i=i-1;
print(i);
}
}

