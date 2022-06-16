package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletStepsTooMuch implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletStepsTooMuch(){
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Inncorrect wallet balance", 200, wallet.getBalance());
            throw new io.cucumber.java8.PendingException();
        });

        When("I request $300", () -> {
            cashier.withdraw(wallet, 300);
            throw new io.cucumber.java8.PendingException();
        });
        Then("I should be told that I have insufficient funds in my account", () -> {
            String display = cashier.insufficientFunds(wallet, 300);
            Assert.assertEquals("You don't have sufficient funds in your account", display);
            throw new io.cucumber.java8.PendingException();
        });
    }
}
