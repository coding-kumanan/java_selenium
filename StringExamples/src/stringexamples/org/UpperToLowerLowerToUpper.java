package stringexamples.org;

public class UpperToLowerLowerToUpper {
//this program replace given text into uppercase to lowercase and lowercase to uppercase wise versa 
	public static String UppeToLowerLowerToUpper(String originalText) {
		String  replacedText= "";
		int uppercasecount=0;
		int lowercasecount=0;
		for(int i=0;i<originalText.length();i++) {
			//in Characterclass isLowercase method is present
			if(Character.isLowerCase(originalText.charAt(i)))
			{   
				lowercasecount++;
				replacedText+= Character.toUpperCase(originalText.charAt(i));
			}
			else {
				uppercasecount++;
				replacedText+=Character.toLowerCase(originalText.charAt(i));
			}
		}
		System.out.println(replacedText);
		System.out.println("no of uppercase is "+uppercasecount+ "\nno of lowercase is "+lowercasecount);
		return replacedText;
		
	}
	public static void main(String[] args) {
		UppeToLowerLowerToUpper("KuuMMannAN");
		UppeToLowerLowerToUpper("MMMNNNnnnN");
	}

}
