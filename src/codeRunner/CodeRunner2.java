package codeRunner;

import java.util.Arrays;

import program.Program;

public class CodeRunner2 implements Program {
	public void execute() {
		System.out.println(sumOfColOne(new double[][] {}));

		System.out.println(sumOfColOne(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));


		System.out.println(-4 % 3);
		
		double[][] x = new double[0][2];

		System.out.println(Arrays.deepToString(x));		
		System.out.println(Math.abs(Integer.MIN_VALUE));
		System.out.println(linkeQuersummeN(Integer.MIN_VALUE, 3));
	}
	
	public boolean hat222(int x) 
	{
		int count2 = 0;
		while (x != 0) {
			if (x % 10 == 2) {
				if (++count2 == 3) return true;
			}
			else count2 = 0;
			
			x /= 10;
		}
		return false;
	}
	
	public boolean hatHoechstens(int x, int n) 
	{
		int count2 = 0;
		while (x != 0) {
			if (x % 10 == 2 && ++count2 > n) 
				return false;					
			x /= 10;
		}
		return true;
	}

	public boolean hatKein222(int x) 
	{
		while (x != 0 && x % 1000 != 222) {
			x /= 10;
		}
		return x == 0;
	}

	public boolean hatMindestens(int x, int n) 
	{
		int count2 = 0;
		while (x != 0) {
			if (x % 10 == 2 && ++count2 == n)
				return true;
			x /= 10;
		}
		return n == 0;
	}
	
	public int linkeQuersummeN(int x, int N) 
	{
		int sgn = x < 0 ? -1 : 1;
	    int[] nums = new int[N];
	    int i = 0, sum = 0;
	    
	    while (x != 0) {
	    	nums[i % N] = sgn * x < 10 ? x : sgn*x % 10;
	    	x /= 10; i++;
	    }
	    
	    for (int n : nums) sum += n;
	    
	    return sum;
	}
	
	public int pruefsumme(int[] x, int mod) 
	{
		int sum = 0;
		for (int n : x) sum += n;
		return sum % mod;
	}
	
	public int quersumme(int x) 
	{
		int sum = 0;
		int sign = x == 0 ? 1 : x / Math.abs(x);
		x *= sign;
		for ( ; x != 0; x /= 10) {
			sum += x % 10;
		}
		return sign*sum;
	}

	public int quersummeN(int x, int N) 
	{
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += x % 10;
			x /= 10;
		}
		return sum;
	}

	public double sumOfMatrix(double[][] x){
	    int sum = 0;
	    for (double[] row : x)
	    	for (double d : row)
	    		sum += d;
	    return sum;	        
	}
	
	public double sumOfSquares(double[] x){
		int sum = 0;
		for (double d : x) sum += d*d;
		return sum;
	}
	
	public double[][] modelExample0(double[][] x){
		double[][] result = new double[x.length][1];
		for (int i = 0; i < x.length; i++) {
			result[i][0] = x[i][0];
		}
		return result;
	}
	
	public double[][] modelExample1(double[][] x){
		for (int m = 0; m < x.length; m++) {
			int sum = 0;
			for (int n = 0; n < x[m].length; n++) {
				sum += x[m][n];
			}
//			x[m] = new double[] { java.util.Arrays.stream(x[m]).sum()};
			x[m]= new double[] {sum}; 
		}
		return x;
	}
	
	public double[][] modelExample(double[][] x){
		if (x.length == 0) return x;
		
		double[][] result = new double[1][x[0].length];
		for (int n = 0; n < x[0].length; n++) {
			for (int m = 0; m < x.length; m++)
				result[0][n] += x[m][n]; 
		}
		return result;
	}
	
	public double sumOfRow2(double[][] x){
		if (x.length < 2) return 0;
		
		double result = 0;
		for (double d : x[1])
			result += d;
		return result;
//		else return java.util.Arrays.stream(x[1]).sum();
	}
	
	public double sumOfColOne(double[][] x){
		int result = 0;
		for (int m = 0; m < x.length; m++) {
			result += x[m][1];
		}
		return result;
	}
}
