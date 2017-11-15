package academic;
import java.util.*;
public class NewDiceGame {

	public static void main(String[] args) {
		
		 
		 boolean playAgain;
			int odd = 0;
			int even = 0;
			int win = 0; 
			int loss = 0;
			int dice;
			int [] arrayWinLoss = new int [50];
			int [] arrayevenOdd = new int [50];
			
			int i = 0;
	 
		   
			
			do {
					 
		        playAgain = false;
		        int genNumber = 1 + (int)Math.ceil (Math.random()*5);
				System.out.println("The die is rolled, pick an even or odd number from 1 - 6.");
			Scanner myScan = new Scanner(System.in); 
		    
		    
			int userGuess = myScan.nextInt();
			
				
			boolean outOfRange = false;
		    int evenOdd;
		    int WinLoss;
		    if	( genNumber % 2 == 1) 
		 
		    	evenOdd = 0;
		
			else 
				evenOdd = 1;
		    if (userGuess < 1 || userGuess > 6) {
				System.out.println("Invalid input");
				outOfRange = true;
				 }
		    if (outOfRange == false ) {
			if (((userGuess % 2 == 1) && (genNumber % 2 ==1))  || (((userGuess % 2 == 0) && (genNumber % 2 == 0)))) 
			{	System.out.print("User Wins the number was: " ); 
			 WinLoss = 1; }
			else {
				System.out.print("User Loses the number was: ");
			 WinLoss = 0;}
			if	( userGuess % 2 == 1) {
				System.out.println("Odd" ); 
	
			}
			else {
				System.out.println("Even" ); 
			
			 
			}
		    
			arrayWinLoss[i] = WinLoss;
			arrayevenOdd[i] = evenOdd;
			 i++;
		    }
	        System.out.println("Would you like to play again?");
	        switch (myScan.next()) {
	            case "yes":
	                playAgain = true;
	                break;
	            default:
	                break;
	        }
	    } while ((playAgain) && (i < 50));

	    System.out.println("Goodbye");
	    for (int counter = 0; counter < i; counter++) {
	    	if (arrayevenOdd [counter]==0)
	    		odd++;
	    	else 
	    		even++;
	    	if (arrayWinLoss[counter]==0)
	    		loss++;
	    	else 
	    		win++;
	    	
	    }
	     System.out.printf("You've Won %d times and Lost %d times \n" , win,loss);
	     System.out.printf("You’ve played %d number of games \n" , i);
	     System.out.printf("The system generate %d number of Odds and %d number of Even \n" , odd, even);
	     System.out.printf("Your winning percentage is: %d Percent \n" , (win*100/i));

	    
	     
		
	}

}
