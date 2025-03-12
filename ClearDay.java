/* Clear Day
Chef classifies a day to be either rainy, cloudy, or clear.

In a particular week, Chef finds 
X
X days to be rainy and 
Y
Y days to be cloudy.
Find the number of clear days in the week.

Input Format
The first and only line of input will contain two space-separated integers 
X
X and 
Y
Y, denoting the number of rainy and cloudy days in the week.
Output Format
Output the number of clear days in the week. */

//CODE:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		System.out.println(7-(X+Y));

	}
}
