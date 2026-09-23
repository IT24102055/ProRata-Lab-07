import java.util.Scanner;

public class IT24102055Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int student,mark,count;
	double tot,average;
	
	for(student=1;student<=3;student++)
	{
	System.out.println("Student" + student);
	System.out.print("Enter marks: ");
	tot=0;

	for(count=1;count<=4;count++)
	{
	mark=input.nextInt();
	tot=tot+mark;
	}

        average = tot/(4.0);
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
	System.out.println("\n");

	}
	input.close();
  }
}

