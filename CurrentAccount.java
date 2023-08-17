package Bank;
public class CurrentAccount implements bank{
    double intrestRate;

    public CurrentAccount(double ir)
    {
        this.intrestRate = ir;
        createacc();
    }

    public void createacc(){
        System.out.println("Creating a Current Account");
    }

    public void intrest(){
        System.out.println("Intrest Rate for Current Account is " + this.intrestRate + "% only." );
    }
}