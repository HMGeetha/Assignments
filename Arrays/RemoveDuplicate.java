package Arrays;
//youtube programme --works for only sorted arrays
public class RemoveDuplicate {
public static void main(String[] args) {
		int arr[]= {2,4,4,5,5,6,7};
		int len = arr.length ;
		int temp[]=new int[arr.length];
		int j = 0 ;
		
		for (int i=0;i<len-1;i++)
		{
			if (arr[i]!=arr[i+1]) {
				
				temp[j] = arr[i];
				
				j++;
				
			}
			
		}
		temp[j++]=arr[len-1];
		for(int k=0;k<j;k++)
		{
			System.out.println(temp[k]);
		}
	}
	}
