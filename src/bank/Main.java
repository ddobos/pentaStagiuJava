package bank;

public class Main {
    public static void main(String[] args) {
        Bank cont = new Bank();
        cont.deposit(23);
        cont.withdraw(10);
        cont.deposit(5);
        cont.withdraw(20);
    }
}
