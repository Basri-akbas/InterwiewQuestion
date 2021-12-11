package package1;

import java.util.Scanner;

public class Frage011 {
	/*
    From a given array find all pairs whose sum is a given number
verilen bir arraydeki, toplamı belirli bir sayı olan tüm çiftleri bulun
           For example; 
           input :  {4, 6, 5, -10, 8, 5, 20} ==> 10
           Output :  4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10 
 */
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int givennumber=scan.nextInt();
		
		 int[] arr={4, 6, 5, -10, 8, 5, 20};
		
		 
		 if(ciftleribul(arr,givennumber)) {
			 System.out.print("");
			 }else System.out.println("Istediginiz toplami verecek sayilar Yok");
		
		
	}

	private static boolean ciftleribul(int[] arr,int num) {
		boolean a=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]+arr[i]==num) {
					a=true;
					System.out.println(arr[j]+" + "+arr[i]+" = "+num);
				}
			}
		}
		return a;
	}

}
