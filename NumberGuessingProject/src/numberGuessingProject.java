import java.util.Scanner;

public class numberGuessingProject
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hi, what is your name? So I can call you by name no boy or girl haha. ");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
				System.out.println("We are going to play a little number guessing game ;)");
				
				Scanner difficultyInput = new Scanner(System.in);
				System.out.println("First can you choose a level of difficulty, easy (1) or hard (2)?");
					int difficulty = difficultyInput.nextInt();
					if (difficulty == 1)
						{
							System.out.println("Easy it is, LETS GO!!!");
							System.out.println(" Okay this game is pretty easy just guess a number between 1 and 5");
						}
						
					if (difficulty == 2)
						{
							System.out.println("Alrighty your funeral...but hey you got this! Lets get started!");
							System.out.println(" Okay this game is pretty easy just guess a number between 1 and 10");
						}
		
					int secretNumber = (int) (Math.random() * 10) + 1;
					int counter = 0;  
								{
									counter++;
								}
					boolean playerGuessing = true;
					
					while (playerGuessing)
						{
							Scanner numberGuessInput = new Scanner(System.in);
							int guess = numberGuessInput.nextInt();
							
							if (guess < secretNumber)
								{
									System.out.println("Whoops, that guess is too low!");
								}
							else if (guess > secretNumber)
								{
									System.out.println("Nope, try again, that is too high!");
								}
							else
								{
									System.out.println("YAY! You finally got it! That is correct!");
									playerGuessing = false;
								}
						}
					System.out.println("So, do you want to keep playing (1) or are you all done (2)?");
					Scanner playAgainInput = new Scanner(System.in);
					int playAgain = playAgainInput.nextInt();
					
					
					//Test
					
					
						{
							
						}
				
				
			}

	}
