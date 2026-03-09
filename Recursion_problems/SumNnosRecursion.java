class SumNnosRecursion{
public static void main(String[] args){
System.out.println(Sumnos_rec(4));
}
static int Sumnos_rec(int num){
if(num!=0){
return num+Sumnos_rec(num-1);
}
else{
return num;
}
}
}
