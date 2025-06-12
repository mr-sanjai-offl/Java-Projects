import model.Account;

public class BankServiceTest {
    public static void main(String[] args) {
        Account account = new Account(101, "Test User");

        account.deposit(500);
        assert account.getBalance() == 500 : "Deposit failed";

        boolean withdrawn = account.withdraw(200);
        assert withdrawn && account.getBalance() == 300 : "Withdraw failed";

        boolean overWithdraw = account.withdraw(1000);
        assert !overWithdraw : "Over-withdraw should fail";

        System.out.println("All tests passed!");
    }
}
