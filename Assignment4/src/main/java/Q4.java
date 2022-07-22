
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Oddsum = 0;
		int EvenSum = 0;
		int arr[] = {1,2,3,4,5,6,7,8,9,0,};
		
		for(int i: arr) {
			System.out.print(i);
			
			if(i%2 == 0) {
			 Oddsum = Oddsum+arr[i];
			}
			else {
				EvenSum = EvenSum+arr[i];
			}
		}	
		System.out.println();
		System.out.println("Odd number sum = " + Oddsum);
		System.out.println("Even number sum = " + EvenSum);
	}

}
