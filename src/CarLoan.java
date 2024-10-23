
// Calculates the Car Loan Payment
// Looks at Car Loan Amount, Interest Rate, Length of Loan (in years), Down Payment

    public class CarLoan {
        public static void main(String[] args) {
            int carLoan = 10000;
            int loanLength = 3;
            int interestRate = 5;
            int downPayment = 2000;

            if (carLoan <= 0 || interestRate < 0){
                System.out.println("Error! You must take out a valid car loan.");
            } else if (carLoan <= downPayment) {
                System.out.println("The car can be paid in full.");
            } else {
                int remainingBalance = carLoan - downPayment;
                int months = loanLength * 12;
                int monthlyBalance = remainingBalance / months;
                int interest = (monthlyBalance * interestRate) / 100;
                int monthlyPayment = monthlyBalance + interest;
                System.out.println(monthlyPayment);
            }

        }
    }

