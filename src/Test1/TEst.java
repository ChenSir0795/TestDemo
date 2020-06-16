package Test1;

public class TEst {
	public static int[] twoSum(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }

           return new int[]{-1,-1};
    }

	public static void main(String[] args) {
		int[] nums1= {2,7,5,6};
		int target1=13;
		int[] result=new int[2];
		result=twoSum(nums1,target1);
//		System.out.println(result[0]+","+result[1]);
		
		int x=4,y=5;
		int z=sum(x,y);
		System.out.println(z);
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
}