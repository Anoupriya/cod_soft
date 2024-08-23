import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    int pin=1234;
	    int balance=10000;
	    int addamount=0;
	    int takenamount=0;
	    String name;
	    Scanner input=new Scanner(System.in);
	    System.out.println("enter the password");
	    int password=input.nextInt();
	    if(password==pin)
	    {
	        System.out.println("enter your name:");
	        name=input.next();
	        System.out.println("welcome"+name);
	        while(true)
	        {
	            System.out.println("press 1 to check balance");
	            System.out.println("press 2 to add amount");
	            System.out.println("press 3 to take amount");
	            System.out.println("press 4 to  print recipt");
	            System.out.println("press 5 to EXIT");
	       
	            int opt=input.nextInt();
	            switch(opt)
	            {
	                case 1:
	                    System.out.println("your cuurent balance"+balance);
	                    break;
	                case 2:
	                    System.out.println("print the amount to add");
	                    addamount=input.nextInt();
	                    System.out.println("successfully credited");
	                    balance=addamount+balance;
	                    break;
	                case 3:
	                    System.out.println("enter amount to taken");
	                    takenamount=input.nextInt();
	                    if(takenamount>balance)
	                    {
	                        System.out.println("your balance is insufficient");
	                        System.out.println("try less than available balance");
	                    }
	                    else
	                    {
	                        System.out.println("successfully taken");
	                        balance=balance-takenamount;
	                    }
	               break;
	               case 4:
	                    System.out.println("welcome  to mini atm");
	                    System.out.println("available balance"+balance);
	                    System.out.println("amount deposited"+addamount);
	                    System.out.println("amount withdraw"+takenamount);
	                    System.out.println("thanks for visting mini atm");
	                    break;
	                default:
	                    System.out.println("press the number below 5");
	                    break;
	                
	            }
	            if(opt==5)
	            {
	                System.out.println("thank you");
	            }
	        
	     else
	     {
	         System.out.println("wrong pin");
	     }
	            
	        }
	     
	    
        }   
}
}