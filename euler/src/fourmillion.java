
public class fourmillion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a =0, b =1 ,c ;
		long even, sum=0;
		 
		while(b < 4000000)
		{
			c= a + b; 
			a =b;
			b=c;					
			System.out.println("b:"+b);
			if (((b%2)==0) && (b < 4000000))
			{
				sum = sum +b;
				System.out.println( "even sum : "+sum);
			}
		}
		
	}

}
