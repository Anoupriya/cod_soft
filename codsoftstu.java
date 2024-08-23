import java.util.Scanner;

class sample
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int n=s.nextInt();
		int marks[]=new int[n];
		int i,total=0,avg;
		String grade;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the mark for subject "+ (i+1));
			marks[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			total+=marks[i];
		}
		avg=total/n;
		if(avg>=80)
		{
			grade="A";
		}
		else if(avg>=70 && avg<80)
		{
			grade="B";
		}
		else if(avg>=60 && avg<70)
		{
			grade="C";
		}
		else if(avg>=50 && avg<60)
		{
			grade="D";
		}
		else
		{
			grade="E";
		}
		
		System.out.println("\nTOTAL MARKS OBTAINED:" + total);
		System.out.println("AVERAGE MARKS :" + avg+"%");
		System.out.println("YOUR GRADE IS :" + grade);
	}
}
		
	