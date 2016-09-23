
public class Fibonacci {

	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 */
	public static int[] fibonacciNumber(int n) {
		int[] fiboList = new int[n];
		fiboList[0]=0;
		fiboList[1]=1;
		
		for(int i=2;i<n;i++){
			fiboList[i] = fiboList[i-1]+fiboList[i-2];
		}
		
		
		return fiboList;
		
	}
	
	public static void main(String args[]){
		
		int[] list = new int[10];
		list = fibonacciNumber(10);
		
		for(int i=0;i<10;i++)
		System.out.println(list[i]);
		
	}
	
	
}
