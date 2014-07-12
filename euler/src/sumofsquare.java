
public class sumofsquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=100;
		long  sum;
		long  sumsquare;
		long difference;
		sum=((n*(n+1))/2);
		sumsquare= (n*(n+1)*((2*n)+1))/6;
		System.out.println("sum :"+sum+"\nsumsquare :"+sumsquare);
		difference = (long) (Math.pow(sum, 2)-sumsquare);
		System.out.println("\ndiff: "+difference);
	}

}
