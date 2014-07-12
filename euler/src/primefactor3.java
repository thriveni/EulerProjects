import java.math.BigInteger;


public class primefactor3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  //define limit
        int limit = 100;
        int check;
        BigInteger b3;
        BigInteger r;

        BigInteger x= new BigInteger("600851475143");
        BigInteger i= new BigInteger("1");
        BigInteger increment= new BigInteger("1");
        BigInteger b1= new BigInteger("0");
       
        BigInteger b4;
       
        System.out.println("Prime numbers between 1 and " + limit+"x= "+x.divide(i));
        b4=x.divide(i);
       // b3=b4.intValue();
       System.out.println("b4 :"+b4); //loop through the numbers one by one
     //   for(int i=1; i < b3; i++){
        	
        while ((i.compareTo(x))<0)	
        { 
                boolean isPrime = true;
                BigInteger j= new BigInteger("2");
                //check to see if the number is prime
               // for(int j=2; j < i ; j++)
                while((j.compareTo(i))<0)
                {
                        r= (i.remainder(j));
                        check = r.intValue();
                        if(check == 0){
                                isPrime = false;
                                break;
                         }
                        
                        j=j.add(increment);
                      //  System.out.println(" j = :"+j);
                }
                // print the number
                if(isPrime)
                {  
                	System.out.print( "\n"+i);
                	
                	              	
                	BigInteger r1 = x.remainder(i);
                	check = r1.intValue();
                	//System.out.println(" reminder "+check);
                  
                	if (check== 0)
                	{
                		
                			if(b1.compareTo(i)<0)
                			{
                				b1=i;
                			}
                		                   		    
                			System.out.println("primefactor "+ i + " b1 ="+b1);
                	}  
               	 	
                } 
                
               i= i.add(increment);
                //System.out.println(" i = :"+i);
        }
        
        System.out.println("biggest primefactor"+ b1);  
	}

}
