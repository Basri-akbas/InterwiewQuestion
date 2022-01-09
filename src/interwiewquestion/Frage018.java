package interwiewquestion;

import java.util.Scanner;

public class Frage018 {
	/*
	 Ask user to enter the number of lines of a inverted half pyramid by using numbers.
	 Type a program to create the inverted half pyramid.
	 For example if the number of lines is 5, the pyramid will be like;

	 1 2 3 4 5
	 1 2 3 4
	 1 2 3
	 1 2
	 1

	 Kullanýcýnýn  girdigi satýr sayýsý kadar sayýlarla ters yarým piramid sekli yazdýran bir program create ediniz.

	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		
		for(int i=sayi;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			
			}
			System.out.println();
		}
	}

}
