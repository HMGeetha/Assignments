package Arrays;

import java.util.Arrays;

public class RemovDuplicNonsort {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,4,5,7,7};
		Arrays.sort(a);
		int n = a.length;
		int []b= new int[n];
		int i=0 ;
		int j=0 ;
		for ( i = 0; i<n; i++)
		{
			int val1 = a[i];
		
			for( j = i+1; j<n;j++)
			{
				int val2 = a[j];
				
				if(val1==val2)
				{
					b[i]=val1;
				}
		    }
		}
		for(int k=0; k<b.length-1; k++)
		{
			if(b[k]!=b[k+1])
			if(b[k]!=0)
			
			System.out.println(b[k] + " " );
		}
}
}

