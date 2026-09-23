import java.util.Scanner;
public class IT24102055Lab7Q3 {
  public static void main (String[]args) {
  Scanner input = new Scanner(System.in);

	int i;
	double tot,amount,discount;
	char mode;
	discount=0;

 	for(i=1;i<=5;i++)
	{
	System.out.println("Customer"+" " + i);
	System.out.print("Enter the total bill amount:");
	tot=input.nextDouble();
	System.out.print("Enter mode of payment(C for cash, O for others):");
	mode = input.next().charAt(0);
	
	switch(mode)
	{ 
	case 'C': 
	discount=tot*0.05;
	System.out.println("Discount is:" + discount);
	amount=tot-discount;
	System.out.println("Amount to be paid:" + amount);
	break;

	case 'O': System.out.println("No discount applicable");
	amount=tot;
	System.out.println("Amount to be paid:" + amount);
	break;

	default: System.out.println("Payment mode is Not Vaild");
	}

	System.out.println("\n");
	}
	


	input.close();
  }
}











	
