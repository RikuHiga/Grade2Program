package Week4;
//Exercise
    /*
    public class Week4.ExWeek4{
    //加算関数
    static int add(int a1, int a2) {
        return a1 + a2;
    }


    //mainメソッドは必ず以下のように宣言する
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c;
        c = add(a,b);
        System.out.println(a + "+" + b + "=" + c);
    }
    }*/

    //Exercise2
    /*class Student {
        String name;
        String department; //所属学科
        String phone;
        String address;
        int credits;
    };

    public class Week4.ExWeek4 {

        static void getCredit(Student s) { //(4)
            s.credits += 1; //(5)
        }

        public static void main(String args[]){
            Student a = new Student(); //(1)
            Student b = new Student(); //(6)
            a.credits = 80; //(2)
            b.credits = 90;

            getCredit(a); //(3) Student aの参照を渡している
            getCredit(a);
            getCredit(a);

            System.out.println("a.credits = " + a.credits);
            System.out.println("b.credits = " + b.credits);
        }
    }*/

    //Exercise3
    /*class Student {
        String name;
        String department; //所属学科
        String phone;
        String address;
        int credits;

        void getCredit() { //staticはつけない，Student sもいらない
            //暗黙に渡されたインスタンスはthisで参照できる．
            this.credits += 1;
        }
    };

    public class Week4.ExWeek4 {
        public static void main(String args[]){
            Student a = new Student();
            Student b = new Student();
            a.credits = 80;
            b.credits = 90;

            a.getCredit();
            a.getCredit();
            b.getCredit();

            System.out.println("a.credits = " + a.credits);
            System.out.println("b.credits = " + b.credits);
        }
    }*/

    //クラスの練習1
    /*class Student {
        String name;
        String department; //所属学科
        String phone;
        String address;
        int credits;
        boolean graduate;

        void checkCredit() { //staticはつけない，Student sもいらない
            //暗黙に渡されたインスタンスはthisで参照できる．
            if(this.credits>=130){
                this.graduate=true;
            }else{
                this.graduate=false;
            }
        }
    };

    public class Week4.ExWeek4 {
        public static void main(String args[]){
            Student a = new Student();
            Student b = new Student();
            a.credits = 130;
            b.credits = 90;

            a.checkCredit();
            b.checkCredit();

            System.out.println("a.graduate = " + a.graduate);
            System.out.println("b.graduate = " + b.graduate);
        }
    }*/

    //クラスの練習2
    class vector2{
        int x;
        int y;
        int add;
        int sub;
        double distance;

        void calcAdd(){
            this.add=x+y;
        }
        void calcSub(){
            this.sub=x-y;
        }
        void calcDistance(){
            this.distance = Math.sqrt(x*x+y*y);
        }
    }
    public class ExWeek4{
        public static void main(String[] args){
            vector2 a = new vector2();
            vector2 b = new vector2();
            a.x=2;
            a.y=3;
            b.x=5;
            b.y=7;
            a.calcAdd();
            a.calcSub();
            a.calcDistance();
            b.calcAdd();
            b.calcSub();
            b.calcDistance();
            System.out.println("aベクトルの加算結果は"+a.add+"です。減算結果は"+a.sub+"です。長さは"+a.distance+"です。");
            System.out.println("aベクトルの加算結果は"+b.add+"です。減算結果は"+b.sub+"です。長さは"+b.distance+"です。");
        }
    }