package Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter two Strings: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		if(s1.length() != s2.length())
		{
			System.out.println("Strings are not anagrams");
		}
		else
		{
			char[] S1 = s1.toLowerCase().toCharArray();
			char[] S2 = s2.toLowerCase().toCharArray();
			Arrays.sort(S1);
			Arrays.sort(S2);
			if(Arrays.equals(S1,S2))
			{
				System.out.println("Strings are anagrams");
			}
			else
			{
				System.out.println("Strings are not anagrams");
			}
		}

	}

}
