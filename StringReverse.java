package StringReverse;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word,reverse=" ";
		System.out.println("Enter a String: ");
		word = sc.nextLine();
		if(word==null || word.isEmpty())
		{
			System.out.println("String is empty");
		}
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse=reverse+word.charAt(i);
		}
		System.out.println("Reverse of "+word+" is: "+reverse);

	}

}
