package Arrays;

public class singleMissingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {1,2,3,5,6};
		for(int i=0;i<a.length-1;i++)
		{
			if (a[i+1]!= a[i]+1)
			{
				System.out.println(a[i]+1);
				break;
			}
				
		}

	}

}
