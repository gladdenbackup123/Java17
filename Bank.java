class BankAccount{
    //data hiding
    private int balance = 5000;

    //controlled access 
    //getter method - public
    public int getBalance(String pin){
        if(pin=="8080"){
            System.out.println("Balance fetched successfully.");
            return balance;
        }
        else{
            System.out.println("Access Blocked - Incorrect pin");
            return -1;
        }
    }
    //setter method - public
    public void setBalance(int amount){
        balance += amount;
        System.out.println(amount + "Rs. credited successfully.");
        System.out.println("Your current balance is "+balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println(b.getBalance("8080"));

        b.setBalance(1000);

    }
}