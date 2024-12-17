package Arrays;

public class RemoveDuplicat2 {

	public static void main(String[] args) {
		int []a= {2,3,3,4,5,5,6};
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if (a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
		 	}
		}
	 a[j]=a[a.length-1];
	 for(int i=0;i<j+1;i++) 
	//Any one of the for loop condition we can use,both are valid
	/* a[j++]=a[a.length-1]; 
	 for(int i=0;i<j;i++) */
	{
		System.out.println(a[i]);
	}
}
}
