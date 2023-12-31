public class BankAccount {
    private int AccNum;
    private String AccHolderName;
    private int Balance;
    public BankAccount(int a,String s,int b){
        AccNum=a;
        AccHolderName=s;
        Balance=b;
    }
    public int getAccNum(){
        return AccNum;
    }
    public String getAccHolderName(){
        return AccHolderName;
    }

    public int getBalance() {
        return Balance;
    }
    public void deposit(int amount){
        Balance+=amount;
    }
    public void withdraw(int amount){
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }else
        {
            Balance-=amount;
        }

    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount(2200319,"issra",1000);
        System.out.println("Your account number is: "+b.getAccNum());
        System.out.println(" account holder name: "+b.getAccHolderName());
        System.out.println("Your account balance is: "+b.getBalance());
        b.deposit(900);
        System.out.println("Your account balance is: "+b.getBalance());
        b.withdraw(2000);
        System.out.println("Your account balance is: "+b.getBalance());
        b.withdraw(200);
        System.out.println("Your account balance is: "+b.getBalance());



    }
}




