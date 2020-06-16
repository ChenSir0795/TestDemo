package 冒泡法排序;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={72,89,65,58,87,91,53,82,71,93,76,68};
		int n=nums.length;
		int max=nums[0],min=nums[0],sum=nums[0];
		for(int i=1;i<n;i++) {
			if(nums[i]>max)
				max=nums[i];
			if(nums[i]<min)
				min=nums[i];
			sum+=nums[i];
		}
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
		System.out.println("和："+sum);
		System.out.println("平均值："+(double)sum/n);

	}

}
