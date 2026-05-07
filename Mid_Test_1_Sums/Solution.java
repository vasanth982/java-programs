import java.util.Arrays;
class Solution{
public int[] sortSquares(int[] arr){
int n=arr.length;
int[] result=new int[n];
for(int i=0;i<n;i++){
result[i]=arr[i]*arr[i];
}
Arrays.sort(result);
return result;
}
public static void main(String[] args){
Solution obj=new Solution();
int[] nums={-7,-3,2,3,11};
int[] result = obj.sortSquares(nums);
System.out.println("sortrdSquences:"+Arrays.toString(result));
}
}