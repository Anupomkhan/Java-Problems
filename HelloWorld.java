// //task-1:
// public class HelloWorld {
//     //depesit
//     public static double deposit(double balance, double amount) {
//         return balance + amount;
//     }
//     // withdraw
//     public static double withdraw(double balance, double amount) {
//         return balance - amount;
//     }
//     public static void main(String[] args) {
//         double balance_1 = 1000;
//         double balance_2 = 500;
//         balance_1 = deposit(balance_1, 200); // deposit 200 to wallet 1
//         balance_2 = withdraw(balance_2, 100); // withdraw 100 from wallet 2
//         System.out.println("Wallet 1 Balance: " + balance_1);
//         System.out.println("Wallet 2 Balance: " + balance_2);
//     }
// }

// //task-2:
// public class HelloWorld {
//     static class Wallet {
//         private double balance;

//         Wallet(double balance) {
//             this.balance = balance;
//         }

//         public void deposit(double amount) {
//             this.balance += amount;
//         }

//         public void withdraw(double amount) {
//             this.balance -= amount;
//         }

//         public double get_balance() {
//             return this.balance;
//         }
//     }
//     public static void main(String[] args) {
//         Wallet w1 = new Wallet(1000);
//         Wallet w2 = new Wallet(500);

//         w1.deposit(200);
//         w2.withdraw(100);

//         System.out.println("Wallet 1 Balance: " + w1.get_balance());
//         System.out.println("Wallet 2 Balance: " + w2.get_balance());
//     }
// }

//task-3:
// public class HelloWorld {
//     static class Wallet {
//         private static int counter = 1;
//         private int id;
//         private double balance;

//         Wallet() {
//             this.id = counter++;
//             this.balance = 0;
//         }

//         Wallet(double balance) {
//             this.id = counter++;
//             this.balance = balance;
//         }

//         public void deposit(double amount) {
//             this.balance += amount;
//         }

//         public void withdraw(double amount) {
//             this.balance -= amount;
//         }

//         public int get_id() {
//             return this.id;
//         }

//         public double get_balance() {
//             return this.balance;
//         }
//     }
//     public static void main(String[] args) {
//         Wallet w1 = new Wallet();
//         Wallet w2 = new Wallet(500); 

//         w1.deposit(300);
//         w2.withdraw(100);

//         System.out.println("Wallet 1 → ID: " + w1.get_id() + ", Balance: " + w1.get_balance());
//         System.out.println("Wallet 2 → ID: " + w2.get_id() + ", Balance: " + w2.get_balance());
//     }
// }

//task-4:
public class HelloWorld {

    static class Wallet {
        private static int counter = 1;
        private int id;
        private double balance;
        private String last_mode;

        Wallet() {
            this.id = counter++;
            this.balance = 0;
        }

        Wallet(double balance) {
            this.id = counter++;
            this.balance = balance;
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public void withdraw(double amount) {
            this.balance -= amount;
            this.last_mode = "NORMAL";
        }

        public void withdraw(double amount, String mode) {
            this.balance -= amount;
            this.last_mode = mode;
        }

        public int get_id() {
            return this.id;
        }

        public double get_balance() {
            return this.balance;
        }

        public String get_last_mode() {
            return this.last_mode;
        }
    }
    public static void main(String[] args) {
        Wallet w1 = new Wallet(1000);
        Wallet w2 = new Wallet(500);

        w1.withdraw(200, "ATM");
        w2.withdraw(100);

        System.out.println("Wallet 1 → ID: " + w1.get_id() +
                ", Balance: " + w1.get_balance() +
                ", Last Withdraw Mode: " + w1.get_last_mode());

        System.out.println("Wallet 2 → ID: " + w2.get_id() +
                ", Balance: " + w2.get_balance() +
                ", Last Withdraw Mode: " + w2.get_last_mode());

        w2.withdraw(200, "ONLINE");
        System.out.println("Wallet 2 → ID: " + w2.get_id() +
                ", Balance: " + w2.get_balance() +
                ", Last Withdraw Mode: " + w2.get_last_mode());
    }

}
