package ð�ݷ�����;

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
		System.out.println("���ֵ��"+max);
		System.out.println("��Сֵ��"+min);
		System.out.println("�ͣ�"+sum);
		System.out.println("ƽ��ֵ��"+(double)sum/n);

	}

}
