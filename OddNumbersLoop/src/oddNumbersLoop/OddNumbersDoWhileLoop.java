package oddNumbersLoop;

public class OddNumbersDoWhileLoop {
	
public static void main (String [] args) {
		
		int d = 1;
		do
		{
			if ( d % 2 == 1) {
		    	
				System.out.println(" This number is odd "+ d);
				
			}
			
			d++;
			
		}while(d <= 20);
	}

}
