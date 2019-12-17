package Week5;/*class Week5.BankAccount {
    int number;
    int balance;

    //入金処理
    void deposit(int amount) {
        this.balance += amount;
    }
}*/

class BankAccount {
    public int number;
    public int balance;

    BankAccount(int arg1) {
        System.out.println("Week5.BankAccount Constructor");
        balance=arg1;
    }

    void deposit(int amount) {
        balance += amount;
    }
}


public class ExWeek5 {
    public static void main(String[] args){
        /*Week5.BankAccount a1 = new Week5.BankAccount();
        Week5.BankAccount a2 = new Week5.BankAccount();
        a1.balance = 0;
        a2.balance = 0;

        a1.deposit(10);
        a2.deposit(20);

        System.out.println(a1.balance);
        System.out.println(a2.balance);*/

        BankAccount a1 = new BankAccount(10);
        BankAccount a2 = new BankAccount(10);
        BankAccount a3 = a2;

        a1.deposit(10);
        a2.deposit(20);
        a3.deposit(30);

        System.out.println("a1:"+a1.balance);//10
        System.out.println("a2:"+a2.balance);//50 a2.depositで20が入り、a3.depositで30が加算される
        System.out.println("a3:"+a3.balance);//50 a2を参照している

    }
}
