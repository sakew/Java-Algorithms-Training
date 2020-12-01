package listsExercices;

import java.util.LinkedList;

public class CheckForPalindrome {

	public boolean checkForPalindromeMethod(String string) {
		
		// we will use a stack, a StringBuilder which is a mutable string to check for punctuation 
		// and a method to make all characters lowerCase.
		
		LinkedList<Character> stack = new LinkedList<Character>();
		StringBuilder stringNoPunctuation = new StringBuilder(string.length());
		String lowerCase = string.toLowerCase();
		
		// we parse the string and set the current character at the position of the iterator.
		
		for (int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			
		// we define the alphabet so the interpreter knows all characters in a string and where to look at.
			
			if (c >= 'a' && c <= 'z') {
		
		//	we append the current characters to the StringBuilder as we parse the string.	
				
				stringNoPunctuation.append(c);
				
		// we push the current characters onto the stack.		
				
				stack.push(c);
			}
		}
		
		// then we check if the reversed string matches the initial string, if yes then it means that the string is a palindrome.
		
		StringBuilder reversedString = new StringBuilder(stack.size());
		
		// if the stack is empty there is nothing to check for.
		
		while(!stack.isEmpty()) {
		
		// if the stack is not empty we append the current values to the stack, the process is somehow similar to 
		//	the matching parenthesis problem.
			
			reversedString.append(stack.pop());
		}
		
		// the final part of the solution implies checking if the reversed string is equal to the initial string.
		
		return reversedString.toString().equals(stringNoPunctuation.toString());
	}
	
}
