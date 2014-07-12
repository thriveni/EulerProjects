import java.math.BigInteger;


public class nthprime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 int limit = 100;
	        int check;
	        BigInteger b3;
	        BigInteger r;

	        BigInteger x= new BigInteger("105000");
	        BigInteger i= new BigInteger("1");
	        BigInteger increment= new BigInteger("1");
	        BigInteger b1= new BigInteger("100");
	       
	        BigInteger b4;
	       
	        System.out.println("Prime numbers between 1 and " + limit+"x= "+x.divide(i));
	        b4=x.divide(i);
	       // b3=b4.intValue();
	       System.out.println("b4 :"+b4); //loop through the numbers one by one
	     //   for(int i=1; i < b3; i++){
	        int count =9586;	
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
	                	count++;
	                   	              	
	                } 
	               
	               
	               if(count==10001)
	               {
	            	   System.out.println(" within 100 count :"+count + " prime"+i);
	            	  // count=0;
	               }
	               i= i.add(increment);
	               
	               
	                //System.out.println(" i = :"+i);
	        }
		}

	

}
