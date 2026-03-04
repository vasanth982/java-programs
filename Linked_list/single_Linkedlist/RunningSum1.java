class RunningSum1{
public static void main(String[] args){
int[] nums={1,2,3,4,5,6};
int k=4;
rngSum(nums, k);

}

public static void rngSum(int[] nums, int k){

int sum=0;
int itr = 0;
for (; itr < k; itr++) {
sum=sum+nums[itr];
}

int max=sum;

for(int i=k-1;i<nums.length-1;i++){
sum=sum+nums[i+1]-nums[i+1-k];
if(sum>max) {
max=sum;
}
}
System.out.println(max);

}

}