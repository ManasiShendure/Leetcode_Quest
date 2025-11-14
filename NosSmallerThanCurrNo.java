package Day2;

public class NosSmallerThanCurrNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {8,1,2,2,3};
		int ans[]=smallerNumbersThanCurrent(nums);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] result=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] < nums[i]){
                    count++;

                }
            }
            result[i]=count;
        }
        return result;
    }

}
