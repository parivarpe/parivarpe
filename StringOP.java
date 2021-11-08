/*/*: The string "PAYPALISHIRING" is written in a
zigzag pattern on a given number of rows like this: (you may
want to display this pattern in a fixed font for better legibility)
P.......A........H.......N
..A..P....L....S....I...I....G
....Y.........I........R
And then read line by line: PAHNAPLSIIGYIR
Write the code that will take a string and make this conversion
given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING"
, 3) should return
"PAHNAPLSIIGYIR"*/
*/


import java.util.*;
class StringOP {

	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String s=sc.nextLine();
		System.out.println("ENTER ROWS");
		int Rows=sc.nextInt();
		System.out.println(convert(s,Rows));
	}
	
	    static String convert(String s, int Rows) 
	{

        if (Rows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(Rows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) 
		{
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == Rows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}