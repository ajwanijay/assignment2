
public class stringClass {
	public String reverseString(String a) {
		String reverse = "";
		int strLen = a.length();
		for(int i = strLen - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println("specter");
		return reverse;
	}
	
	public void printSomething() {
		
	}
	
	
	
	
	public static void main(String[] args) {
		stringClass s = new stringClass();
		String rev = s.reverseString("specter");
		System.out.println(rev);
		
	}
}
