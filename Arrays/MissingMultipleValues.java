package Arrays;

public class MissingMultipleValues {
//This program is correct
	public static void main(String[] args) {
		int[]a= {1,2,5,7,8,10};
		int len = a.length;
		int lstVal=a[len-1];
		int[] b = new int[lstVal + 1];
		for(int i=0; i<len ;i++)
		{
			int val =a[i];
			b[val] =val;
		}
		for (int i=1;i<b.length;i++)
			if(b[i]==0)
			{
			System.out.println("Missing Numbers is ="+i);
		    }
		}
		
}	
	
	
		
		
// below program is wrong as it does not give consecutive answer	
		
	/*int []a = {1,2,3,4,7,8};
		int len = a.length;
		int[] b = new int [len-1];
		
		int k=0;
		for(int i=0; i<=len-2; i++)
		{
			if(a[i+1]!= a[i]+1)
			{
				b[k]=a[i]+1 ;
				k++ ;
			}
			
		}
		
		for( int i=0; i<b.length; i++)
		{
			if (b[i]!=0)
			{
				System.out.println("Missing number is =" +b[i]);
			}

	}

}
}
*/
