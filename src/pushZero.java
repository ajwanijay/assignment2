
public class pushZero {
	
    static void pushZerosToEnd(int array[], int n)
    {
        int count = 0;  
 
    for (int i = 0; i < n; i++)
            if (array[i] != 0)
                array[count++] = array[i]; 
                                       
 
        while (count < n)
            array[count++] = 0;
    }
 
    
    public static void main (String[] args)
    {
        int array[] = {1, 7, 0, 2, 0, 0, 1, 7, 0, 6, 0, 9, 3, 5};
        int n = array.length;
        pushZerosToEnd(array, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");

}
}