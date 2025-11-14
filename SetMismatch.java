package Day2;

public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {1,2,2,4};
		int []ans=findErrorNums(nums);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int duplicate = -1, missing = -1;
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) duplicate = i;
            if (count[i] == 0) missing = i;
        }
        
        return new int[]{duplicate, missing};
    }

}
