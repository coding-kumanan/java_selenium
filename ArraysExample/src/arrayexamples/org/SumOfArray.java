package arrayexamples.org;

public class SumOfArray {
	static int a[]= {1,2,3,4,5,6,7,8,9,10};
	//static int sum = 0;
	static double avg = 0;
	public int arySum() {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];	
		}
		return sum;	
	}
		public double aryAvg() {
			SumOfArray b = new SumOfArray();
			System.out.println(b.arySum());
			avg = b.arySum()/a.length;
			System.out.println(avg);
			return avg;	
		}
	public static void main(String[] args) {
		
		SumOfArray arry =new SumOfArray();
		System.out.print("Sum of array value is "+ arry.arySum() + " Avg is "+ arry.aryAvg());
	}

}
