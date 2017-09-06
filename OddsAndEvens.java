import java.util.*;
public class OddsAndEvens {

/* this program asks you to select whether you think the resulting equation will be odd or even
* you select whether you want to guess odd or even
* then the computer gets the opposite
* select a number 1-5
* computer randomly selects a number 1 -5
* output will display whether result was odd or even
*/
	
	public static void main (String[]args){
		name();
		choice();
		
		
	}
		public static void name(){
		//import a scanner object
		Scanner input = new Scanner(System.in);
		
		//Introduce user to the game that will be played
		System.out.println("Lets play a game called \"Odds and Evens\" ");
		
		//Ask user for their name
		System.out.println("What is your name?");
		String name =input.nextLine();
		System.out.println("Nice to meet you " + name);
		}
		public static void choice(){
			//create a scanner object for user input
			Scanner input = new Scanner(System.in);
			System.out.println("Type either O for odd or E for even, be sure to capitalize: ");
			String odd= input.nextLine();
			String even= input.nextLine();
			if (odd.equals("O")){
				System.out.println("Odd by choice, the computer is even!");
			
			} 
			else if (odd.equals("o")){
				System.out.println("Odd by choice, the computer is even!");
			}
			
			else{
				System.out.println("Even by choice or default, the computer is Odd");
			}
			System.out.println("----------------------------------");
			
		
			//Ask the user how many fingers they are going to play
			System.out.println("How many \"Fingers\" are you going to play? ");
			int numOfFingers = input.nextInt();
			//Display the amount the user plays
			System.out.println("You play " + numOfFingers + " Fingers");
			
			//Now inform the player the computer will play its turn
			System.out.println("Now its the computers turn to play!");
			
			//Use the below code to randomize the computers' play
			Random rand = new Random ();
			int computer = rand.nextInt(6);
			//now display the computers' choice
			System.out.println("The computer played " + computer);
			//create another separating line of ---
			System.out.println("---------------------------------");
			
			//create a sum variable
			int sum = numOfFingers + computer;
			
			//Now display the sum
			System.out.println("The sum is " + sum);
			
			//Use the below code to determine if sum is odd or even
			boolean oddOrEven = sum % 2 == 0;
			 if (oddOrEven){
				 System.out.println("The result is even");
				 
				 }else{
					 System.out.println("The result is odd");
				 }
			

}}