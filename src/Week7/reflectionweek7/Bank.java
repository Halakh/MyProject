package reflectionweek7;

public class Bank {

    public void transfer(Integer salary, String bankAccount) {
        System.out.println("Transfer successful: " + salary + " Euro to account " + bankAccount);
    }

}

//Paying every employee means that one class receives one
// bank account and the amount and displays on the screen
// that the payment has been successfully made.
// For example:
// bank.transfer(salary, account)
