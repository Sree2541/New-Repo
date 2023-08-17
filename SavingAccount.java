package Bank;


    public class SavingAccount implements bank{
        double intrest;

        public SavingAccount(double ir)
        {
            this.intrest=ir;
            createacc();
        }

        public void createacc(){
            System.out.println("Creating a Savings Account");
        }

        public void intrest(){
            System.out.println("Intrest Rate for Savings Account is " + this.intrest + "% only." );
        }
    }



