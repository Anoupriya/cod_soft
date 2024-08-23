import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.inputStreamReader;
import java.util.Random;

class cs
{
	public static void main(String args[])
	{
		int tries=0,score=0,i;
		System.out.println("\t\t\tNUMBER GUESSING GAME\n");
		System.out.println("do you want to try this game(yes/no)");
		Scanner choice=new Scanner(System.in);
		String c=choice.next();
		System.out.println("Enter the number of chances:");
		int n=choice.nextInt();
		System.out.println("\nrandom number:");
		Random rand=new Random();
		int val=rand.nextInt(101);
		System.out.println(val);
		System.out.println("\nROUND 1:");

		for(i=0;i<n;i++)
		{
			//String c="yes";
			
			while(c.equals("yes"))
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("\nguess the number between 1-100:");
				int guess=sc.nextInt();
				if(guess>=101)
				{
					System.out.println("invalid input");
					break;
				}
				if(guess>val)
				{
					System.out.println("TOO HIGH, guess little lower");
					tries++;
					break;
				}
				if(guess<val)
				{	
					System.out.println("TOO LOW, guess little higher");
					tries++;
					break;
				}
				if(guess==val)
				{
					score++;
					System.out.println("YOUR GUESS IS CORRECT");
					System.out.println("YOUR SCORE: "+ score);
					System.out.println("ATTEMPTS FAILED: "+ tries);
					System.out.println("REMAINING CHANCES: "+ (n-tries));
					System.out.println("");
				
					System.out.println("do you want to play again:(yes/no)");
					c=choice.nextLine().toLowerCase();
					if(c.equals("no"))
					{
						//i=10;
						System.out.println("GAME ENDED");
						break;
					}
					while(!c.equals("yes"))
					{

						System.out.println("Enter the valid input(yes/no)");
						c=choice.nextLine().toLowerCase();
					}
					System.out.println("\nRandom value:");
					val=rand.nextInt(101);
					System.out.println(val);
					System.out.println("");	
				}	
				
			}
		}
	}
}
		
		
		//while(guess<0 || guess>0)
		//{
		//			System.out.println("\nguess the number between 1-100:");
		//	int guess=sc.nextInt();
		//}