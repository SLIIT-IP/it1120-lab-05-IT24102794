import java.util.Scanner;

public class IT24102794Lab5Q3 {
	private static final double Price=48000.00;	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	

        System.out.print("Enter Start Date (1-31): ");
        int StaDate = scanner.nextInt();

	System.out.print("Enter End Date (1-31): ");
        int EndDate = scanner.nextInt();
	

	if (EndDate < StaDate) {
	System.out.print("Error: Start Date must be less than End Date");
	}

	if (1 > StaDate) { 
	System.out.print("Error: Days must be between 1 and 31 ");
        }
	else if (31 < StaDate) {
	System.out.print("Error: Days must be between 1 and 31 ");
	}


	System.out.println("Room Charge Per Day: Rs. 48000.0/=");

		double ReDays = EndDate - StaDate;

	System.out.println("Number of Days reserved:"+ReDays);

	if (ReDays < 3) {
		System.out.println("Total Amount to be Paid : "+Price);	
		}
	else if (ReDays <= 4) {
		double total = ReDays*Price - ReDays*Price*0.01;
			System.out.println("Total Amount to be Paid : "+total); 
		}
	else if (ReDays >= 5) {
		double total = ReDays*Price - ReDays*Price*0.02;
			System.out.println("Total Amount to be Paid : "+total);
		}        
    }
}