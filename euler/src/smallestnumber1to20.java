
public class smallestnumber1to20 {

	
	public static void main(String[] args) {
		
		long smallest;
		long reminder;
		int p[]= new int[10];
		for (int i=10000000;i<=11000000;i++)
		{   
			boolean issmall = false;
			int count =1;
			int c=0;
			for ( int j=1;j<=20;j++)
			{
				reminder = i%j;
				if(reminder ==0)
				{
					System.out.println("reminder"+reminder+" j:"+j);
					if(count==20)
					{
						issmall=true;
					}
					
					count++;
				}
				else
				{
					break;
				}
				
			}
			
			if(issmall)
			{
				p[c]=i;
				System.out.println("\n   the  polyndrome................."+ i);
				c++;
				break;
			}
		}
		
		System.out.println(":"+p[0]+p[1]);
	}

}
