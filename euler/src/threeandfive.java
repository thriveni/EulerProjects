
public class threeandfive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long three=0, five=0;
		int i=1;
		while((3*i) < 1000)
		{  
			  three=three+(3*i);
			  System.out.println("\n three ="+ (3*i)+ " total three "+three);
                           
			  if((5*i)< 1000)
			  {
				if(((5*i)%3)!=0)
				{
			    five=five+(5*i);
			   	System.out.println("\n five ="+ (5*i) + " total five"+five);
				}
		      }
			  
			   i++;	
		}
		
		System.out.println("three : "+three + "  five "+ five +" total: " +(three+five));

	}

}
