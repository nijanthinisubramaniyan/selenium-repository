package Testll;
 
import java.util.Scanner;

public class Isprimenumber {

public static void main(String[] args) {
	 int n =35 ;
	 int count;
	 System.out.println("prime number are");
		for(int i = 1; i<=n; i++)
			
		{
			
			count=0;
			
			for(int j=1; j<=i;j++) 
			{
				
				if(i%j==0) {
					count++;
					
				}
			}
			

		if(count==2)
		{
			
		
				System.out.println(i );
			
		}
		}
		
}

}

 


	
		
	


