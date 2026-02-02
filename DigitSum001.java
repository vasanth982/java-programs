class DigitSum001{
public static void main(String[] args){

findDigitSum();
}
static void findDigitSum(){
int N=742,r=0,dsum=0;
while(N!=0){
r=N%10;
dsum=dsum+r;
N=N/10;
}
System.out.println(dsum);
}
}