public class Discussion_05 {
    public static void main(String[] args) {
        // Task 01: procedural wallet
        double balance_1 = 100.0;
        double balance_2 = 200.0;

        balance_1 = deposit(balance_1, 50.0);
        balance_2 = withdraw(balance_2, 75.0);

        System.out.println("Balance 1: " + balance_1);
        System.out.println("Balance 2: " + balance_2);

        System.out.println();

        // Task 02 and 03: Wallet class, private balance, unique final id
        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet(500.0);

        wallet1.deposit(150.0);
        wallet2.withdraw(100.0);

        // Task 04: overloaded withdraw with mode
        wallet2.withdraw(50.0, "ATM");

        System.out.println("Wallet 1 ID: " + wallet1.getId() + ", Balance: " + wallet1.getBalance());
        System.out.println("Wallet 2 ID: " + wallet2.getId() + ", Balance: " + wallet2.getBalance());
        System.out.println("Wallet 2 last withdraw mode: " + wallet2.getLastWithdrawMode());

        System.out.println();

        // Task 05: add bonus using wallet reference
        addBonus(wallet1, 25.0);
        System.out.println("Wallet 1 after bonus: " + wallet1.getBalance());

        // Task 05: check if references can be swapped from main
        int wallet1IdBeforeSwap = wallet1.getId();
        int wallet2IdBeforeSwap = wallet2.getId();

        System.out.println("Before swap: wallet1 ID = " + wallet1.getId() + ", wallet2 ID = " + wallet2.getId());
        swapWallets(wallet1, wallet2);
        System.out.println("After swap: wallet1 ID = " + wallet1.getId() + ", wallet2 ID = " + wallet2.getId());

        if (wallet1.getId() == wallet1IdBeforeSwap && wallet2.getId() == wallet2IdBeforeSwap) {
            System.out.println("References are not swapped in main.");
        } else {
            System.out.println("References are swapped in main.");
        }
    }

    public static double deposit(double balance, double amount) {
        return balance + amount;
    }

    public static double withdraw(double balance, double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance.");
            return balance;
        }

        return balance - amount;
    }

    public static void addBonus(Wallet wallet, double amount) {
        wallet.deposit(amount);
    }

    public static void swapWallets(Wallet wallet1, Wallet wallet2) {
        Wallet temp = wallet1;
        wallet1 = wallet2;
        wallet2 = temp;

        System.out.println("Inside swap: wallet1 ID = " + wallet1.getId() + ", wallet2 ID = " + wallet2.getId());
    }

    static class Wallet {
        private static int counter = 0;

        private final int id;
        private double balance;
        private String lastWithdrawMode;

        public Wallet() {
            this(0.0);
        }

        public Wallet(double initialBalance) {
            counter++;
            this.id = counter;
            this.balance = initialBalance;
            this.lastWithdrawMode = "NONE";
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > this.balance) {
                System.out.println("Not enough balance in wallet " + this.id + ".");
                return;
            }

            this.balance -= amount;
            this.lastWithdrawMode = "NORMAL";
        }

        public void withdraw(double amount, String mode) {
            if (amount > this.balance) {
                System.out.println("Not enough balance in wallet " + this.id + ".");
                return;
            }

            this.balance -= amount;
            this.lastWithdrawMode = mode;
        }

        public int getId() {
            return this.id;
        }

        public double getBalance() {
            return this.balance;
        }

        public String getLastWithdrawMode() {
            return this.lastWithdrawMode;
        }
    }
}
