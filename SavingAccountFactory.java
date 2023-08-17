package Bank;


public class SavingAccountFactory{
    public static bank createacc(){
        return new SavingAccount(6.5);
    }
}