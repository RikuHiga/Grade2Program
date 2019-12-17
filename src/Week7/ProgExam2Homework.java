package Week7;

public class ProgExam2Homework {
    /*public static void main(String[] args){
        Gakkyu class1=new Gakkyu(3,"仲程崇");
        class1.studentSet(0,"taro",160,60);
        class1.studentSet(1,"jiro",170,160);
        class1.studentSet(2,"saburo",180,50);

        class1.heightAverage();
    }

    static class Gakkyu{
        Student[] students;
        String teacher;

        Gakkyu(int num_student,String teacher){//コンストラクタ
            students=new Student[num_student];
            this.teacher=teacher;
        }

        void studentSet(int num,String name,float height,float weight){
                students[num]=new Student(name,height,weight);
        }

        void printStduent(){
            for(var stu:students){
                System.out.println(stu.name+stu.height+stu.weight);
            }
        }

        void heightAverage(){
            float heightSum=0;
            for(var stu:students){
                heightSum+=stu.height;
            }
            System.out.println("生徒の身長の平均は"+heightSum/students.length+"です。");
        }

    }

    static class Student{
        String name;
        float height;
        float weight;

        Student(String name,float height,float weight){
            this.name=name;
            this.height=height;
            this.weight=weight;
        }
    }*///Gakkyu
    public static void main(String[] args){
        Bank JPbank=new Bank("日本銀行",3);
        JPbank.setAccount(0,"佐藤",300);
        JPbank.setAccount(1,"鈴木",200);
        JPbank.setAccount(2,"高橋",100);
        JPbank.accounts[0].deposit(100);
        JPbank.accounts[0].withdraw(200);
        System.out.println(JPbank.bankName+"の全預金額は"+JPbank.allBalances()+"円です。");
    }
}
class Account{
    String name;
    int creditBalance;

    Account(String name,int moneyAmount){
        this.name=name;
        this.creditBalance=moneyAmount;
    }

    void deposit(int amount){//入金
        this.creditBalance+=amount;
        System.out.println(name+"に"+amount+"円入金しました。残高は"+creditBalance+"円です。");
    }
    void withdraw(int amount){
        this.creditBalance-=amount;
        System.out.println(name+"から"+amount+"円引き出しました。残高は"+creditBalance+"円です。");
    }
}

class Bank{
    String bankName;
    Account[] accounts;

    Bank(String bankName,int num_account){
        this.bankName=bankName;
        accounts=new Account[num_account];
    }

    void setAccount(int num,String name,int moneyAmount){
        accounts[num]=new Account(name,moneyAmount);
    }

    int allBalances(){
        int sumBalances=0;
        for(var ac:accounts){
            sumBalances+=ac.creditBalance;
        }
        return sumBalances;
    }
}
