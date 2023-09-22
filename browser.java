package Testll;

public class browser {

	

		public static void launchBrowser(String bname)
		{
			
		  System.out.println("browser launch successfully ");
		  
			return;
		}
		
		
		public void loadurl()
		{
			
			System.out.println("application url loaded successfully ");
			
		}
		
		
		public static void main(String[] args) {
			
			
			edgeBrowser ed = new edgeBrowser();
			ed.Edge(3, 2);
			browser window = new browser();
			window.launchBrowser("chrome");
			window.loadurl();
		
			
			
			
		}
		
		
		
		
		
		
		
		
	}


