class banksystem{
    private int accountno;
    private String password;
   private  String account_holdername;
   private  int balance;


banksystem(int accno,String pass,String holdername,int balance){
    this.accountno=accno;
    this.password=pass;
    this.account_holdername=holdername;
    this.balance=balance;

}

 void withdraw(){
    System.out.println("withdraw amount");
}
void  deposit(){
    System.out.println("deposit amount");
}
void checkbalance(){
    System.out.println("checkbalance amount");
}
public int getAccountno(){
    return this.accountno;
}
public void setAccountno(int accountno){
    this.accountno=accountno;
}
public String getPassword(){
    return this.password;
}
public void setPassword(String password){
    this.password=password;
}
public String getAccount_holdername(){
    return this.account_holdername;
}
public void setAccount_holdername(String account_holdername){
    this.account_holdername=account_holdername;
}
public int getBalance(){
    return this.balance;
}
public void setBalance(int balance){
    this.balance=balance;
}
public void callwithdraw(){
    this.withdraw();
}

public void calldeposit(){
    this.deposit();
}
public void callcheckbalance(){
    this.checkbalance();
}
}

public class bank1 {
    public static void main(String[] args) {
        banksystem b1=new banksystem(12344,"muskan12","muskan",1000);
        System.out.println(b1.getPassword());
        b1.callwithdraw();

        
    }
}

