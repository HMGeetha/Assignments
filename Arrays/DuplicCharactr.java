package Arrays;
public class DuplicCharactr {
public static void main(String[] args) {
		String string1 = "great responsibility" ;
		int count ;
		//Converts given string into character array    
		char[] str =string1.toCharArray();
		System.out.println("duplicate characters in given string");
		  //Counts each character present in the string 
		 //length of string is 20
		 for (int i=0;i<str.length;i++) {
			 count =1;
		 for (int j=i+1; j<str.length;j++)
		 {
			if (str[i] == str[j] && str[i] != ' ')
				{
						count++;
						//Set string[j] to 0 to avoid printing visited character    
						str[j]='0' ;
				}}
		//A character is considered as duplicate if count is greater than 1    
		 if (count > 1 && str[i]!='0')
			 System.out.println(str[i]);
	}
	}
}
