package Bank;

public class maincls {
    public static void main(String[] args)
    {
        SavingAccount sa = (SavingAccount) SavingAccountFactory.createacc();
        sa.intrest();

        CurrentAccount ca = (CurrentAccount) CurrentAccountFactory.createacc();
        ca.intrest();

        loanaccount la = (loanaccount) LoanAccountFactory.createacc();
        la.intrest();
    }
}
