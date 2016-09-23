
public class person {

		int age;
		boolean gender;
		
		void getgender(){
			if (gender == false){
				System.out.println("male");
				
			}
			else {
				System.out.println("female");
			}
		}
		
		
		void getage(){
			if( age <1){
				System.out.println("kid is infant");
			}
			else if (1<age && age<3){
					System.out.println("kid is toddler");
				}
			else if (3<age && age<5){
					System.out.println("kid is preschholer");
			}
			else  if (5<age && age<=6 ){
				
				if (gender == false){
					System.out.println("KG male");
				}
				else {
					System.out.println("KG female");
				}
				
			}
			else {
				System.out.println("invalid entery");
			}
		}


	public static void main(String[] args){
		person kid = new person();
		kid.age = 2;
		kid.gender=false;
			kid.getage();
			kid.getgender();
			
	}
				
		
	}