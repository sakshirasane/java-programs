/*Q.2
In this problem you will be given a string S , consisting of lowercase alphabets 
(a-z), in which each character is unique. 
Another string INF is formed by repeating the string S infinitely many times.
Example: If S = “abcde” then the string INF is…abcdeabcdeabcde… 
Here the dots (’.’) indicate that there are infinitely many characters before and 
after the string.
Now you will be given another string A and asked to find whether there is any 
sub-string in INF which is identical to A.
Input Format
• The first line contains the number of test-cases T.
• The next T lines will contain a space-separated string, made up of two parameters:
• The first parameter will be infStr, representing S from the above example
• The second parameter will be toFind, representing A from the above example.
Output Format
• The function should print YES if A can be found in S, otherwise it should print NO.
e.g., If the second line of input contains:
abcd abce
• The function should print NO, because, if we repeat “abcd” infinitely many times 
we will get, “…abcdabcdabcdabcd…” . We will never get an “e”.
Evaluation Parameters
Sample Input:
ghijk ghijkghi
Sample Output:
YES
Explanation"
• The infinite string of 'ghijk' contains 'ghijkghi' as it's sub-string, hence 
you print YES.*/



package doselect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteString {
	
	public static boolean infString(String infStr,String toFind) {
		if(toFind.length()<infStr.length()&& !infStr.contains(toFind)) {
			return false;
			
		}
		String replaceStr= infStr;
		while(replaceStr.length()<toFind.length()*3) {
			replaceStr += infStr;
		}
		
		return replaceStr.contains(toFind);
		}
	public static void main(String[] args) throws IOException {
	
		BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String words[]=str.split(" ");
		String a=words[0];
		String b=words[1];
		
		if(infString(a,b)) {
			System.out.println("YES");
			
		}
		else {
			System.out.println("NO");
		}
			
}
}
