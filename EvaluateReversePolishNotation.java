package Day3;
import java.util.*;
public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] tokens= {"2","1","+","3","*"};
		System.out.println(evalRPN(tokens));

	}
	    public static int evalRPN(String[] tokens) {
	       Stack<Integer> st=new Stack<>();
	       for(int i=0;i<tokens.length;i++)
	       { String s=tokens[i];
	        if(s.equals("+")|| s.equals("-")||s.equals("*")|| s.equals("/"))
	       {
	        int var2=st.pop();
	        int var1=st.pop();
	        int result;
	        if(s.equals("+"))
	        {
	            result=var1+var2;
	        }
	        else if(s.equals("-"))
	        {
	            result=var1-var2;
	        }
	        else if(s.equals("*"))
	        {
	            result=var1*var2;
	        }
	        else 
	        {
	            result=var1/var2;
	        }
	         st.push(result);
	       }
	       else
	       {
	        st.push(Integer.parseInt(s));
	       }
	       }
	       return st.pop();
	    }

}
