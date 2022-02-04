import java.util.Scanner;

public class Exam {

	public static void main (String [] args) {

	int marks=0, average=0, sum=0;

	Scanner num = new Scanner (System.in);
	
	for (int i = 1; i <= 25; i++) {

	System.out.println("Enter mark - " + i + " :");

	marks = num.nextInt();
		
	sum+=marks;	
	}

	System.out.println ("\n Total Marks = "+ sum + "\n" + "Average Mark = "+ (int)sum/10 + "\nMinimum  Mark = "+ min);

	}


	marks = num.nextInt();

	sum+=marks;
	if (marks<min){
	min=marks;
}
}