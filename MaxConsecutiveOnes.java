package Day1;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	 public static int findMaxConsecutiveOnes(int[] nums) {
         int maxCount = 0, count = 0;
      for (int num : nums) {
          if (num == 1) {
              count++;
              if (count > maxCount) maxCount = count;
          } else {
              count = 0;
          }
      }
      return maxCount;
  }

}
