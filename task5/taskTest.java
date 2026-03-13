package task5;

public class taskTest {
    public static void main(String[] args) {

        Account acc = new Account(101, "Banu", 500);

        System.out.println("Initial account: " + acc);

        acc.deposit(200);
        System.out.println("After deposit: " + acc);

        acc.withdraw(100);
        System.out.println("After withdraw: " + acc);

        try {
            acc.withdraw(700);
        } catch (InvalidAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Final account state: " + acc);
    }
}
