class Bank{
    int balance = 5000;
    //private and public are access modifiers
    public int withdraw_money(int amount){
        balance = balance - amount;
        System.out.println("Successfully debited "+amount+"Rs. from your Account.");
        return balance;
    }
}

public class Access {
    public static void main(String[] args) {
        Bank acc1 = new Bank();
        System.out.println(acc1.balance);
        System.out.println(acc1.withdraw_money(1000));
        
    }
}
