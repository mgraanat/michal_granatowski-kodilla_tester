package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount){
        cashSlot.dispense(amount);
    }

    public String insufficientFunds(Wallet wallet, int amount) {
        if(wallet.getBalance() - amount < 0) {
            return "You don't have sufficient funds in your account";
        }
        return "";
    }
}
