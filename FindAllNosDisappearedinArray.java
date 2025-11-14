package Day2;

import java.util.*;

public class FindAllNosDisappearedinArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {4,3,2,7,8,2,3,1};
		List<Integer> ans=findDisappearedNumbers(nums);
		System.out.println(ans);
	}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	       for (int i = 0; i < nums.length; i++) 
	       { 
	        int idx = Math.abs(nums[i]) - 1; 
	        if (nums[idx] > 0)
	         nums[idx] = -nums[idx]; 
	        }
	        List<Integer> result = new ArrayList<>(); 
	        for (int i = 0; i < nums.length; i++)
	         {
	             if (nums[i] > 0) 
	             result.add(i + 1); 
	             }
	              return result;
	    }
}
//| i | nums[i] | idx = abs(nums[i]) - 1 | nums[idx] before | Action                  | nums array after               |
//| - | ------- | ---------------------- | ---------------- | ----------------------- | ------------------------------ |
//| 0 | 4       | 3                      | 7                | mark → make -7          | [4, 3, 2, -7, 8, 2, 3, 1]      |
//| 1 | 3       | 2                      | 2                | mark → make -2          | [4, 3, -2, -7, 8, 2, 3, 1]     |
//| 2 | -2      | 1                      | 3                | mark → make -3          | [4, -3, -2, -7, 8, 2, 3, 1]    |
//| 3 | -7      | 6                      | 3                | mark → make -3          | [4, -3, -2, -7, 8, 2, -3, 1]   |
//| 4 | 8       | 7                      | 1                | mark → make -1          | [4, -3, -2, -7, 8, 2, -3, -1]  |
//| 5 | 2       | 1                      | -3               | already negative → skip | [4, -3, -2, -7, 8, 2, -3, -1]  |
//| 6 | -3      | 2                      | -2               | already negative → skip | [4, -3, -2, -7, 8, 2, -3, -1]  |
//| 7 | -1      | 0                      | 4                | mark → make -4          | [-4, -3, -2, -7, 8, 2, -3, -1] |

