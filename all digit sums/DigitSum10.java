class DigitSum10{

public static void main(String[] args){
DigitSum10 ds =new DigitSum10();

int res=ds.findDigitSum();
System.out.println(res);
}
int findDigitSum(){
int n=22356, r=0,dsum=0;
while(n!=0){
r=n%10;
dsum=dsum+r;
n=n/10;
}
return dsum;
}
}