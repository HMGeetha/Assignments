package Arrays;

/*onlin program to copy value from one array to another array
https://www.geeksforgeeks.org/array-copy-in-java*/
public class CopyingValue {	
	public static void main(String[] args) {
		int k = 0 ;
		int a[] = { 1, 8, 3 }; 
		int b[] = new int[a.length]; 
		//b=a;
		//int j = 0;
	   //System.out.println("Contents of a[] "); 
        for (int i = 0; i < a.length; i++) 
         {
         
         b[k] = a[i]; 
		 System.out.println("Contents of a[] "+a[i] + " Contents of b[]" +b[k]);
         k++ ;
         }
        for(k=0; k < b.length; k++) 
           {
            System.out.print(b[k] + " "); 	
           }
        }
	}
