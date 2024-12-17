package Arrays;

//Youtube,Online Prog
public class MissingNo_array_Onl {

	public static void main(String[] args)
	{
		int [] input = {1,5,3,6,2,6};
		int []reg = new int [input.length+1];
		
		for (int i:input)
		{
			reg[i]=1;
		}
		
		System.out.println("missing number in given array");
		for(int j =1;j<reg.length;j++)
			if (reg[j]==0)
			{
				System.out.println(j);
			}

	}

}
