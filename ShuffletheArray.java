package Day1;

public class ShuffletheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {2,5,1,3,4,7};
		int n=3;
		int []ans=shuffle(nums,n);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + n];
        }
        
        return ans;
    }

}
