package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		String returnString = "";
		for(int i=0;i<input.length();i++)
		{
			if(returnString.length()==0)
				returnString= ""+input.charAt(i) + input.charAt(i);
			else
				returnString=returnString + input.charAt(i) + input.charAt(i);
		}
		return returnString;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""xxyybread

	public String getSandwich(String input) {
		for(int i=0;i<input.length()-5;i++)
		{
			if(input.substring(i, i+5).equals("bread"))
			{
				for(int j=input.length()-5;j>=0;j--)
				{
					if(input.substring(j,j+5).equals("bread"))
					{
						if(j!=i)
							return input.substring(i+5,j);
						else
							return "";
					}
				}
			}
		}
			
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int d;
		if(a>=b && a>=c)
		{
			d=a;
			a=c;
			c=d;
			if(a>=b)
			{
				d=a;
				a=b;
				b=d;
			}
		}
		else
			if(b>=a && b>=c)
			{
				d=b;
				b=c;
				c=d;
				if(a>=b)
				{
					d=a;
					a=b;
					b=d;
				}
			}
			else
				if(a>=b)
				{
					d=a;
					a=b;
					b=d;
				}
		if(b-a==c-b)
			return true;
		return false;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		String returnString;
		returnString= input.substring(0, a) + input.substring(input.length()-a);
		return returnString;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		if(input.length()>=2)
			if(input.substring(input.length()-2).equals("ly"))
				return true;
		return false;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		if(input.length()>=2)
		{
			if(input.charAt(0)==input.charAt(1))
			{
				input=stringClean(input.substring(1));
			}
			else
				input=input.charAt(0)+stringClean(input.substring(1));
		}
		return input;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1
	// fibonacci(5) = 4+3= 3+2 + 2+1

	public int fibonacci(int input) {
		if(input==1)
			return 1;
		else
			if(input==0)
				return 0;
		
		return fibonacci(input-1)+fibonacci(input-2);
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		if(input>=1)
			return 2+bunnyEars(input-1);
		return 0;
	}

}
