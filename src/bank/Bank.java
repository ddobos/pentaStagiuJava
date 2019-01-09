package bank;

public class Bank {
    private double money;

    public Bank() {
        System.out.println("Creare cont");
    }

    public Bank(double money) {
        this.money = money;
        System.out.println("Creare cont");
    }

    public double getMoney() {
        System.out.println("Bani in cont : " + money);
        return money;
    }

    private void setMoney(double money) {
        this.money += money;
    }

    public void withdraw(double money) {
        double rest = this.money - money;
        if (rest < 0) {
            System.out.println("Insuficienta de mijloace in cont");
            return;
        }
        System.out.println("extragere mijloace banesti");
        setMoney(-money);
    }

    public void deposit(double money) {
        System.out.println("Suplinire cont");
        setMoney(money);
        getMoney();
    }
}
