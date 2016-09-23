
public class uglyNumbers {
	
	public static boolean isUgly(int n) {
		if (n == 1) {
			return true;
		}
		
		for (int i = 2; i <= n/2; i++) {
			if (n%i == 0) {
				if (i%2 != 0 && i%3 != 0 && i%5 != 0) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("17 is ugly: " + isUgly(17));
		System.out.println("23 is ugly: " + isUgly(23));
		System.out.println("21 is ugly: " + isUgly(21));

	}

}
