import java.util.*;
class MaxProfitSubarray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

int maxsofar=arr[0];
int currentmax=arr[0];

for(int i=1;i<n;i++){

currentmax=Math.max(arr[i],currentmax+arr[i]);
maxsofar=Math.max(currentmax,maxsofar);
}
System.out.println(maxsofar);
}
}
