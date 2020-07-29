package Package1;

public class StringPrg {

	public static void main(String[] args) {
		String text = "MyTestString";
		String result = "";
		char ctext1 = text.charAt(0);
		result = result + Character.toLowerCase(ctext1);
		//System.out.println(result);
		for(int i=1; i<text.length();i++) {
			char ctext = text.charAt(i);
			if(Character.isUpperCase(ctext)) {
				result += " ";
				result = result + Character.toLowerCase(ctext); 
			}
			else {
				result += ctext; 
			}
		}
		System.out.println("The Camel to Snake case text is: " + result);
	}
}
