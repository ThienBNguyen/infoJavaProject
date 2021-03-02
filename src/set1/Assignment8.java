package set1;

public class Assignment8 {
	public static void main(String [] args) {
        //The Metro Bank
		int accountNumber = 1000; //need first number to be 1 and 4 digits
        int accountBalance = 1000;//need to be more than 1000 else else no loan
        int salary = 500000; // 25000 - 500000, 50000 - 6000000, 75000 - 7500000
        String loanType = "Business"; // car house business
        int expectedLoanAmount = 1000000;
        int emisExpected = 100; //36, 60, 84
        int eligibleLoanAmount = 0;
        int eligibleEmis = 0;
        if(accountNumber >= 1000 && accountNumber < 2000 && accountBalance >= 1000) {
            if( salary > 25000 && salary <= 50000) {
                eligibleEmis = 36;
                eligibleLoanAmount = 500000;
                if(eligibleLoanAmount < expectedLoanAmount || eligibleEmis < emisExpected) {
                    System.out.println("Sorry, I can not take the loan. " + "My expected loan " + expectedLoanAmount + " is higher than the bank loan " + eligibleLoanAmount + "." + "My expected emis " + emisExpected + " is higher than the bank emis " + eligibleEmis + ".");
                }else{
                    System.out.println("eligibleLoanAmount = " + eligibleLoanAmount + "\n" + "eligibleEmis = " + eligibleEmis);
                    System.out.println("congratulation on your" + loanType + " .");
                }
            }else if( salary > 50000 && salary <= 75000){
                eligibleEmis = 60;
                eligibleLoanAmount = 6000000;
                if(eligibleLoanAmount < expectedLoanAmount || eligibleEmis < emisExpected) {
                    System.out.println("Sorry, I can not take the loan. " + "My expected loan " + expectedLoanAmount + " is higher than the bank loan " + eligibleLoanAmount + "." + "My expected emis " + emisExpected + " is higher than the bank emis " + eligibleEmis + ".");
                }else{
                    System.out.println("eligibleLoanAmount = " + eligibleLoanAmount + "\n" + "eligibleEmis = " + eligibleEmis);
                    System.out.println("congratulation"  + loanType + " .");
                }
            }else if( salary > 75000){
                eligibleEmis = 84;
                eligibleLoanAmount = 7500000;
                if(eligibleLoanAmount < expectedLoanAmount || eligibleEmis < emisExpected) {
                    System.out.println("Sorry, I can not take the loan. " + "My expected loan " + expectedLoanAmount + " is higher than the bank loan " + eligibleLoanAmount + "." + "My expected emis " + emisExpected + " is higher than the bank emis " + eligibleEmis + ".");
                }else{
                    System.out.println("eligibleLoanAmount = " + eligibleLoanAmount + "\n" + "eligibleEmis = " + eligibleEmis);
                    System.out.println("congratulation"  + loanType + " .");
                }
            }else{
                System.out.println("sorry, your salary is not met with the criteria of the current loan.");
            }
        }else{
            System.out.println("Sorry, you are not eligible for loan with current application.");  }

    }
}
