
/*Given a string s consists of upper/lower-case alphabets and empty space characters ' '
, return the length of the last word in the string. If the last word does not exist, return 0.*/

import java.util.*;
public class StringManipulation
{

	static int stLength(String st) 
	{
		if(st.length() == 0)
			return 0;
		char[] ch = st.toCharArray();
		int counter = 0;
		
		for(int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ') {
				counter = 0;
				continue;
			}
			counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=input.nextLine();
		System.out.println(stLength(st));
	}
}