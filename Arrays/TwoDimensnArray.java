package Arrays;

public class TwoDimensnArray {

	public static void main(String[] args) {
		int[][]arr = {{1,2},{4,5},{7,8}};
		 for(int row=0;row<arr.length;row++) {
			 for (int col=0;col<arr[0].length;col++)
			 {
				 System.out.print(arr[row][col]+ " ");
				 
			 }
			 System.out.println();
		}
	
	}
}

