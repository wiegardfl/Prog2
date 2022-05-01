package codeRunner;
import program.Program;


public class CodeRunner1 implements Program {
	public void execute() {
		System.out.println(fromBinaryString("0"));
	}
	
	boolean checkPredecessor(int[] x) {
	    for (int i = 1, count = 1; i < x.length; i++){
	        if (x[i] > x[i-1] && ++count > 2)
	            return false;
	    }
	    return true;
	}
	
	double computeNorm(double[] x) 
	{
	    double acc = 0;
	    for (double e : x) acc += e*e;
	    return acc;
	}
	
	boolean istPalindrom(String x) 
	{
	    for (int i = 0; i < x.length() / 2; i++){
	        if (x.charAt(i) != x.charAt(x.length() - 1 - i)) 
	        return false;
	    }
	    return true;
	}

	int fromBinaryString(String x) 
	{
		int acc = 0;
	    for (int base = 0; base < x.length(); base++) {
	        int index = x.length()-1-base;
	        int bitValue = x.charAt(index) - '0';
	        if (bitValue != 0 && bitValue != 1) {
	        	throw new IllegalArgumentException("Invalid input at index " + index + ": input is not 0 or 1. (Given " + x.charAt(index));
	        }
	        acc |= bitValue << base;
	    }
	    return acc;
	}

}
