class DigitSum01{
public static void main(String[] args){
DigitSum01 ds=new DigitSum01();
int m=12345;
ds.findDigitSum(m);
}
void findDigitSum(int N){
int r=0,dsum=0;
while(N!=0){
r=N%10;
dsum=dsum+r;
N=N/10;
}
System.out.println(dsum);
}
}