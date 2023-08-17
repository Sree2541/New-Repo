package Bank;


public class CurrentAccountFactory {
    public static bank createacc(){
        return new CurrentAccount(7.5);
    }
}
