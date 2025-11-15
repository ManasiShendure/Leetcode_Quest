package Day3;
import java.util.*;
public class ExclusiveTimeofFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		List<String> logs= Arrays.asList("0:start:0","1:start:2",
				"1:end:5","0:end:6");
		int []ans=exclusiveTime(n,logs);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	 public static int[] exclusiveTime(int n, List<String> logs) {
		   int[] ans = new int[n];
		        Stack<Integer> st = new Stack<>();
		        int prev = 0;

		        for (String log : logs) {

		            String[] p = log.split(":");
		            int id = Integer.parseInt(p[0]);
		            String type = p[1];
		            int time = Integer.parseInt(p[2]);

		            if (type.equals("start")) {

		                if (!st.isEmpty()) {
		                    ans[st.peek()] += time - prev;
		                }

		                st.push(id);
		                prev = time;
		            } 
		            else {  // end

		                ans[st.pop()] += time - prev + 1;
		                prev = time + 1;
		            }
		        }

		        return ans;
		    }
		}

