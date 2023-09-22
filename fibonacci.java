package Testll;

public class fibonacci {

	public static void main(String[] args) {
		int a=0, b=1, c, n=10;
		
		System.out.println(a+"  "+b);
        
		for(int i=3;i<=n;i++) {
			
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			
			
			
			
			
		}
	}

}
