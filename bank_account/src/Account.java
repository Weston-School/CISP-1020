package src;

/**
 * @author Weston Hale
 * @apiNote Bank Account class holds account number and balance;
 */
public class Account {

    private int account_number = 0;
    private double balance = 0.0;
    
    public Account(){}

    public Account(int number, double balance){
        this.account_number = number;
        this.balance = balance;
    }


    /**
     * @param val Value to set the account balance
     */
    public void set_balance(double val){
        this.balance = val;
    }

    /**
     * @param val Ammount to deposit
     * @return False if the deposit is negative
     */
    public boolean deposit(double val){
        // Check the val is not negative
        if(val < 0.0){
            return false;
        }
        this.balance += val;
        return true;
    }

    /**
     * @param val Ammount to withdraw
     * @return False if the value is negative or the withdraw is larger than the balance
     */
    public boolean withdraw(double val){
        // ensure they have the money and we are not withdrawing a negative val
        if(val > balance || val < 0.0){
            return false;
        }
        this.balance -= val;
        return true;
    }

    public int get_account(){
        return this.account_number;
    }

    public double get_balance(){
        return this.balance;
    }

    public String toString(){
        return ("Account:" + this.account_number + "Balance:" + this.balance + "\n"); 
    }

}
