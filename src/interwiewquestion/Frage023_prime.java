package interwiewquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frage023_prime {
	  /*
    Print prime numbers which are less than or equal to the given number.

    Verilen sayýdan küçük veya ona eþit olan asal sayýlarý yazdýrýnýz.
     */
	static List<Integer>  primeNumber=new ArrayList<Integer>();
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Lütfen bir sayi giriniz");
	        int sayi=scan.nextInt();
	        asal(sayi);
	        System.out.println(primeNumber);
	        scan.close();
	    }

	    public static void asal(int sayi) {
	    	
	    	if(sayi<=1) {
	            System.out.println("Asal sayi degildir");
	        }else if (sayi>=2) {
	        	primeNumber.add(2);
	            for(int i=3;i<=sayi;i++) {
	                int sum=0;
	                for(int k=2;k<i;k++) {
	                    if(i%k==0) {
	                        sum++;
	                    }
	                }
	                if (sum==0) {
	                	primeNumber.add(i);
	                	}
	            }
	        }
	}
}
