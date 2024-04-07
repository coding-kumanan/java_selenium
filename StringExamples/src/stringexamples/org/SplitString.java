package stringexamples.org;

public class SplitString {
	//split the given string using split() method and store in a arrary and print using iration.
	public static void split(String string, String regex ) {
		String[] s2 = string.split(regex);
		for(String w:s2)
		System.out.println(w);

	}
	//print the string after starting index and upto ending index by given index.  
	public static void substring(String string, int startindex, int endindex) {
		System.out.println(string.substring(startindex, endindex));
	}
	public static void main(String[] args) {
		split("my name is kumanan", "n");//string and split by string.
		substring("1234567890", 3, 8);//string and start and end index value. 

	}

}
