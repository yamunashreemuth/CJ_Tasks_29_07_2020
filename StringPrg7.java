package Package1;

import java.util.Scanner;

public class StringPrg7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String res = sc.next();

		
		for(int i=0; i<res.length();i++) {
			
			 if (i % 2 != 0){
		          res = res.substring(0,i-1) + " " + res.substring(i, res.length());
			 }
		}
		System.out.println("removed charecters at odd places: "+ res);
	}




}


