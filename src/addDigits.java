
public class addDigits {
	
	public static int addDigits(int number) {
		if (number / 10 == 0) {
			return number;
		}
		
		int sumOfDigits = 0;
		
		while(number > 0) {
			sumOfDigits = sumOfDigits + number%10;
			number = number/10;
		}
		
		return addDigits(sumOfDigits);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(addDigits(10));
		System.out.println(addDigits(101));
		System.out.println(addDigits(1234));
		System.out.println(addDigits(622013));
		System.out.println(addDigits(77385));
		System.out.println(addDigits(4));
		
	}

}
