package stringexamples.org;

public class FindVowelsCostance {

	public static void main(String[] args) {
		String text = "I am kumanan ae@@@@*7177";
		String lText= text.toLowerCase();
		
		//int vcount= 0,ccount=0;
		String vstrng = "";
		String cstring = "";
		String number = "";
		String spzchar = "";
		String spaces = "";
		
		for(int i=0;i<text.length();i++) {
				if(lText.charAt(i)=='a'|| lText.charAt(i)=='e'
						|| lText.charAt(i)=='i' || lText.charAt(i)=='o' || lText.charAt(i)=='u') {
					vstrng+= lText.charAt(i); 
					//vcount++;
					
				}else if(Character.isLetter(lText.charAt(i))) {
					cstring+= lText.charAt(i);
					//ccount++;
				}else if(Character.isDigit(lText.charAt(i))){
					number+= lText.charAt(i);
				}else if(Character.isSpaceChar(lText.charAt(i))) {
					spaces+= lText.charAt(i);
				}else
					spzchar+= lText.charAt(i);
					
					
				
			}
		System.out.println("Volwes are "+vstrng+"\nCount is "+vstrng.length()+"\n-------");
		System.out.println("Constance are " +cstring+"\nCount is "+cstring.length()+"\n-----");
		System.out.println("Numbers are "+number+"\nCount is "+number.length()+"\n-------");
		System.out.println("Special char are "+spzchar+"\nCount is "+spzchar.length()+"\n--------");
		System.out.println("Spaces are "+spaces+"\nCount is "+spaces.length()+"\n--------");


	
	
	}
}


