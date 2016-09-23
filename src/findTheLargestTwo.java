
public class findTheLargestTwo {
	
	    public void findTheLargestTwo(int[] nums){
	        int large1 = 0;
	        int large2 = 0;
	        for(int n:nums){
	            if(large1 < n){
	                large2 = large1;
	                large1 =n;
	            }
	            else if(large2 < n){
	                large2 = n;
	            }
	        }
	        System.out.println("First Large Number: "+large1);
	        System.out.println("Second Large Number: "+large2);
	    }
	     
	    public static void main(String a[]){
	        int num[] = {5,3,7,2,11,17,9,2};
	        findTheLargestTwo ftl = new findTheLargestTwo();
	        ftl.findTheLargestTwo(num);
	    }
	}

