package package1;

import java.util.Arrays;
import java.util.Scanner;

public class Frage014_Anagram {
	/*
	Ask user to enter  2 Srtrings.
	If the characters and the numbers of characters of the Strings are same then print "Anagram"
	otherwise, print "Not Anagram" on the console.
	Ignore cases
	For example : "Mary" and "army" and "RAMY" are Anagrams

	Kullanýcýdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
	karakterleri ve karakter sayýlarý aynýysa "Anagram" yazdýrýn,   aksi takdirde konsolda "Anagram Deðil" yazdýrýn.
	Ornek : "Pide" ve"EDÝP" anagram ifadelerdir..

	 */

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str1=scan.next();
		String str2=scan.next();
		
		char []arr1=str1.toLowerCase().toCharArray();
		char []arr2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(""+arr1[0]+arr1[1]+arr1[2]+arr1[3]);
		System.out.println(""+arr2[0]+arr2[1]+arr2[2]+arr2[3]);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Anagram degil");
		}
				
	}
}
