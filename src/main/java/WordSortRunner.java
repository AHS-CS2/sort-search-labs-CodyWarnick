//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cody Warnick

import java.util.Arrays;
import static java.lang.System.*;

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort ws = new WordSort("abc ABC 12321 fred alexander");
		ws.sort();
		System.out.println(ws.toString());
		
		//...
		
		
		//add test cases to test your WordSort Class
	}
}