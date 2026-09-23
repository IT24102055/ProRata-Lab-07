import java.util.Scanner;

public class  IT24102055Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int count,tot,mark;
	double average; 
	count=1;
	tot=0;
	mark=0;
	average=0;

	System.out.println("Enter marks for four subjects:");

 	while (count<=4)
	{
	System.out.print("Enter subject mark " + count + ":");

	mark=input.nextInt();

	tot = tot+mark;
	count++;
	}

	average = tot/4;
	System.out.println("Average is:" + average );

	if (average<=100 && average>=75)
	{
	System.out.println("Overall Grade is: Distinction ");
	}
	else if (average<=74 && average>=50)
	{
	System.out.println("Overall Grade is: Credit ");
	}
	else 
	{
	System.out.println("Overall Grade is: Fail ");
	}

	input.close();
  }
}







