package Package1;

import java.util.Scanner;

public class StringPrg5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character to analyze :");
		String res = sc.next();
		String spchar = "~!@#$%^&*()_+*/-;:[]{}|?><,.";
		String num = "0123456789";
		
		for(int i=0; i<res.length();i++) {
			char text = res.charAt(i);
			if(spchar.contains(Character.toString(text))){
				System.out.println("Entered string contain Special character " + Character.toString(text));
			}
			else if(num.contains(Character.toString(text))){
				System.out.println("Entered string contain numerics " + Character.toString(text));
			}else if(i == res.length()-1)
			{
				System.out.println("No Special charcter or numerics in entered string " + res);
			}
		}
		
		  }

	}


