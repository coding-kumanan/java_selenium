package arrayexamples.org;


import java.util.LinkedList;
public class FindIndexofList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int [] a = {10,20,30,90,10,40,50,10};
		System.out.println("Printing each value of linked list using for each");
		for(int x:a) {
		list.add(x);
		System.out.print(x+" ");
		}

		System.out.println("\n----------\neach index values of 10");
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==10)
				System.out.println(i);	
				}
		System.out.println("-----\nadd 50 value to index of 2");
		list.add(2, 50);
		System.out.println(list);
		
		System.out.println("-------\nadd value 100 at the last index of 10");
		list.add(list.lastIndexOf(10), 100);;
		System.out.println(list);
		}

	}
