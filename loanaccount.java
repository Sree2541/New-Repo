package Bank;


public class loanaccount implements bank {
        double interestRate;

        public loanaccount(double ir) {
            this.interestRate = ir;
            createacc();
        }

        public void createacc() {
            System.out.println("Creating a Loan Account");
        }

        @Override
        public void intrest() {
            System.out.println("Interest for Loan Account is " + this.interestRate + "% only.");

        }
    }


