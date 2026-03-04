class RunningSum{
public static void main(String[] args){
int[] nums={1,2,3,4};
int k=2;
rngSum(nums, k);

}

public static void rngSum(int[] nums, int k){

int sum=nums[0]+nums[1];
int max=sum;

for(int i=1;i<nums.length-1;i++){
sum=sum+nums[i+1]-nums[i-1];
if(sum>max) {
max=sum;
}
}
System.out.println(max);

}

}