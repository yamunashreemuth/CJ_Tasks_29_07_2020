package Package1;

public class StringPrg4 {
	
	public boolean uniquechar(String text) {
		String res ="";
		for(int i=0; i<text.length();i++) {
			 char charcterofinputstring=text.charAt(i);
	            int count=0;
			for(int j=i; j<text.length();j++)	
			{
				if(charcterofinputstring== text.charAt(j)) {
					count++;
					} 
				if(count>1) {
					res = res + text.charAt(i);
					System.out.println(res);
					return false;
				} }}
				return true;
			 }
	

	public static void main(String[] args) {
// Pick the Unique charecters in the String = "AMSTERDAM" b. "ILLIIONOS" c. "COSMOS" d. "EPIDEMICPANDEMIC"

	//	String text = "AMSTERDAM ILLIIONOS COSMOS EPIDEMICPANDEMIC";
		boolean result = false; 
		//int[] cchk = new int[256]; 
		
			 /*if(text.charAt(i)!=' ') {
					cchk[(int)text.charAt(i)]++;
				}
					int j = i;
					for(i=0; i<j;i++) {
						if(cchk[(int)text.charAt(i)]!=1) {
							result += text.charAt(i);
						}
					} */
		StringPrg4 obj = new StringPrg4();
		System.out.println(obj.uniquechar("AMSTERDAM ILLIIONOS COSMOS EPIDEMICPANDEMIC"));
	}

}
