package Package1;

public class StringPrg3 {
	public static void main(String[] args) {
		//Change the Sequence of a string = "MYHOMEISJEWEL" to "JEWELISMYHOME"
		String text = "MYHOMEISJEWEL";
		String res= text.substring(8,13);
		String res1= text.substring(6,8);
		String res2= text.substring(0,2);
		String res3= text.substring(2,6);
		
		String output = res.concat(res1+res2+res3);
		System.out.println("The input string is: "+ text+" output string is: " + output);
		
	}
}
