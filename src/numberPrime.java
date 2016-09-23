
public class numberPrime {
	int num;
	boolean prime;
	
	void checkprime(){
		if (prime == false){
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
	}
	public void Prime(int num) {
        int i,temp; 
        for(i=2;i<=num/2;i++)
        {
         temp=num%i;
        if(temp==0)
        {
        prime=false;
        break;
        }
       }
	}
	
	public static void main(String args[]){
		numberPrime num = new numberPrime();
		
		num.num = 11;
		num.checkprime();
	}
		
	}
	

