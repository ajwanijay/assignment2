
public class weirdNumber {

		int n;
		
		
		
		public void getweirdNumber(){
			
			if (n%2 !=0){
				System.out.println("weird");
			}
			
			else if (n%2 == 0 && n>2 && n<=5){
				System.out.println("not weird");
			}
			else if (n%2 == 0 && n>6 && n<=20){
				System.out.println("weird");
			}	
			else if (n%2 ==0 && n>20){
				System.out.println("not weird");
			}
			
			}
		
		public static void main(String[] args){
			weirdNumber n = new weirdNumber();
			
			n.n = 10;
			n.getweirdNumber();
			
			
			
					
		}
		
}

