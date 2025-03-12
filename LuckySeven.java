/* Lucky Seven
Chef considers the number 
7
7 lucky. As a result, he believes that the 
7
7-th letter he sees on a day is his lucky letter of the day.

You are given a string 
S
S of length 
10
10, denoting the first 
10
10 letters Chef saw today.
What is Chef's lucky letter?

Input Format
The only line of input contains a string 
S
S, of length 
10
10.
Output Format
Print a single character: Chef's lucky letter .
Constraints
S
S has a length of 
10
10
S
S contains only lowercase Latin letters (i.e, the characters 'a' to 'z') */

//CODE:

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		System.out.println(s.charAt(6));

	}
}
