package interwiewquestion;

import java.util.Scanner;

public class Frage025 {
	  /*
    1
    2 3 2
    3 4 5 4 3
    4 5 6 7 6 5 4

Kullanýcýnýn  girdigi satýr sayýsý kadar yukarýdaki yarým piramid sekli yazdýran bir program create ediniz.
     */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i <= sayi; i++) {
			System.out.print(i+" ");
			for (int j = 1; j < i; j++) {
				System.out.print(i+j+" ");
			}
			for (int k = i+i-2; k > i-1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
