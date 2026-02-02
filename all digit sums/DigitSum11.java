class DigitSum11{

public static void main(String[] args){
DigitSum11 ds =new DigitSum11();
int m=22356;
int res=ds.findDigitSum(m);
System.out.println(res);
}
int findDigitSum(int n){
int  r=0,dsum=0;
while(n!=0){
r=n%10;
dsum=dsum+r;
n=n/10;
}
return dsum;
}
}