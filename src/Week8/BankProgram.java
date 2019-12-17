package Week8;

import java.util.ArrayList;

class Account{
    String name;
    int balance;

    Account(String name,int balance){
        this.name=name;
        this.balance=balance;
    }

    void deposit(int amount){
        balance+=amount;
        System.out.println(name+"様の口座に"+amount+"円預け入れました。残高は"+balance+"円です。");
    }

    void drawer(int amount){
        balance-=amount;
        System.out.println(name+"様の口座から"+amount+"円引き出しました。残高は"+balance+"円です。");
    }
}

class Branch{
    String name;
    ArrayList<Account> accounts;

    Branch(String name){
        this.name=name;
        accounts=new ArrayList<>();
    }

    int sumBalance(){
        int sum=0;
        for(var account:accounts){
            sum+=account.balance;
        }
        return sum;
    }
}

class Bank{
    String name;
    ArrayList<Branch> branches;

    Bank(String name){
        this.name=name;
        branches = new ArrayList<>();
    }
    int allSumBalance(){
        int sum=0;
        for(var branch:branches){
            sum+=branch.sumBalance();
        }
        return sum;
    }
}
public class BankProgram {
    public static void main(String[] args){
        Bank okinawa=new Bank("沖縄海邦銀行");
        okinawa.branches.add(new Branch("松尾支店"));
        okinawa.branches.get(0).accounts.add(new Account("比嘉",500));
        okinawa.branches.get(0).accounts.add(new Account("金城",500));
        okinawa.branches.add(new Branch("壺川支店"));
        okinawa.branches.get(1).accounts.add(new Account("大城",500));
        okinawa.branches.get(1).accounts.add(new Account("宮城",500));

        System.out.println(okinawa.name+"の総残高は"+okinawa.allSumBalance()+"です。");
        System.out.println(okinawa.branches.get(0).name+"支店の合計残高は"+okinawa.branches.get(0).sumBalance()+"円です。");
        okinawa.branches.get(0).accounts.get(0).deposit(100);
        okinawa.branches.get(0).accounts.get(1).drawer(100);
    }
}
//2057 2118
