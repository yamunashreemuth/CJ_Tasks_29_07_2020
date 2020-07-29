package Package1;

import java.util.Scanner;

public class StringPrg6 {

	public static void main(String[] args) {
	//print char only at even space
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String res = sc.next();
		String spchar = "~!@#$%^&*()_+*/-;:[]{}|?><,.";
		String num = "0123456789";
		
		for(int i=0; i<res.length();i++) {
			char text = res.charAt(i);
			if(spchar.contains(Character.toString(text))) {

				continue;
			}
			else if(num.contains(Character.toString(text)))
			{
				continue;
			}
			System.out.println("only Characters at even places: " +res.charAt(i));
			i = i+1;
		}
		
	}

}
