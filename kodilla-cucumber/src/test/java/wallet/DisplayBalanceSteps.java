package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {
    private Wallet wallet = new Wallet();

    public DisplayBalanceSteps(){
        Given ("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect account balance", 100, wallet.getBalance());
        });

        When ("I check the balance of my wallet", () -> {
            wallet.getBalance();
            Assert.assertEquals(100, wallet.getBalance());
        });

        Then ("I should see that the balance is $100", () -> {
            String display = wallet.display();
            Assert.assertEquals("Account balance: 100$", display);
        });
    }
}
