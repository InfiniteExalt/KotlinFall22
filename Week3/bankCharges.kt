import java.util.Scanner; 
import java.text.DecimalFormat;

public class BankCharges {

	public static void main(String[] args) {
		double BanksFee 	 = 10.00;
		double LessThan20	 = 0.10 ;
		double Between20_39  = 0.08 ; 
		double Between40_59	 = 0.06 ;
		double MoreThan60 	 = 0.04 ;
		double TotalFee		 = 0	;
		int    Checks		 = 0 	;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the number of checks written this month:");
		Checks = userInput.nextInt();
		
		if ( Checks < 20){
			TotalFee = (Checks * LessThan20) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
		}
		
		else if (Checks == 20 || Checks < 40) {
			TotalFee = (Checks * Between20_39) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
		else if (Checks == 40 || Checks < 60) {
			TotalFee = (Checks * Between40_59) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
		else if (Checks > 60) {
			TotalFee = (Checks * MoreThan60) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
	}

}
