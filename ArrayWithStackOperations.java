package Day3;
import java.util.*;
public class ArrayWithStackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []target= {1,3};
		int n=3;
		List<String> ans=buildArray(target,n);
		System.out.println(ans);

	}
	 public static List<String> buildArray(int[] target, int n) {
	        List<String> ans=new ArrayList<>();
	        int t=0;
	        for(int i=1;i<=n;i++)
	        {    if(t==target.length) break;
	            if(i==target[t])
	            {
	                ans.add("Push");
	                t++;
	            }
	            else
	            {
	                ans.add("Push");
	                ans.add("Pop");
	            }
	        }
	        return ans;
	    }

}
