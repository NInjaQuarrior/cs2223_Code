package Q1;

import java.util.Stack;

public class StackCalculator {

	
public double evaluate(String in) {
	double ans;
	Stack<String> ops  = new Stack<String>();
    Stack<Double> vals = new Stack<Double>();
    
    for(String s : parse(in))
    {  
    	if(s != null){// Read token, push if operator.
    		if      (s.equals("("))               ;
    		else if (s.equals("+"))    ops.push(s);
    		else if (s.equals("-"))    ops.push(s);
    		else if (s.equals("*"))    ops.push(s);
    		else if (s.equals("/"))    ops.push(s);
    		else if (s.equals("%"))	   ops.push(s);
    		else if (s.equals("sqrt")) ops.push(s);
    		else if (s.equals("^"))	   ops.push(s);
    		else if (s.equals(")"))
    		{  // Pop, evaluate, and push result if token is ")".
    			String op = ops.pop();
    			double v = vals.pop();
    			if      (op.equals("+"))    v = vals.pop() + v;
    			else if (op.equals("-"))    v = vals.pop() - v;
    			else if (op.equals("*"))    v = vals.pop() * v;
    			else if (op.equals("/"))    v = vals.pop() / v;
    			else if (op.equals("%")) 	v = vals.pop() % v;
    			else if (op.equals("sqrt")) v = Math.sqrt(v);
    			else if (op.equals("^")) v = Math.pow(vals.pop(), v);
    			vals.push(v);
    		}  // Token not operator or paren: push double value.
    		else vals.push(Double.parseDouble(s));
    		}
    }
    ans = vals.pop();
    System.out.println(ans);
 
    return ans;
	      
	   
}

public String[] parse(String in) {
	
	char[] arr = in.toCharArray();
	String[] ans = new String[(in.length()/2)+1];
	int j = 0;
	int lastCut = 0;
	for(int i = 0; i < in.length(); i++) {
		if(arr[i] == ' ' ) {
			ans[j] = in.substring(lastCut, i);
			j++;
			lastCut = i+1;
		}
		ans[j] = in.substring(lastCut);
		
	}
	return ans;
}
}
