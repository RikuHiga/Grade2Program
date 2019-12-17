package Week7;

public class ProgExam2Week7 {
    public static void main(String[] args) {
        // write your code here
        //配列のインスタンスを生成.大きさ（収納可能な要素の数）は3とする
        //int[] ar = new int[3];//ar[0] = 0;とか書く場合

        //配列インスタンスに対しては，[]を用いて要素にアクセスできる.要素番号(index)は0から始まる
        //要素数3の配列の，indexは，0,1,2のいずれかである
        //ar[0] = 0;
        //ar[1] = 10;
        //ar[2] = 20;

        //int[] ar = {0,10,20};//とも代用可能

        //配列インスタンス.lengthで配列の長さ（要素数）を取得できる
        /*for (int i=0; i<ar.length; i++) {
            System.out.println(ar[i]);
        }*/
        //拡張for文
        /*for (int e : ar) {
            System.out.println(e);
        }*/
        //printArray(ar);配列は引数として渡せる

            /*int[] ar2 = ar; //シャローコピーのため、arとar2の値は共有される
            ar2[0] = 99;

            printArray(ar);
            printArray(ar2);*///シャローコピー

            /*int[] ar2=ar.clone();//cloneした場合、別の紙が用意される
            ar2[0]=99;
            printArray(ar);
            printArray(ar2);*///ディープコピー

        Student[] students=new Student[3] ;

        students[0] = new Student("taro", 160, 60);
        students[1] = new Student("jiro", 170, 160);
        students[2] = new Student("saburo", 180, 50);

        students[0].name = "taro";//Student[] students = new Student[3];のままだとエラーが出る。student[0]はnullでどこの誰でもない何かの名前はtaroですと行っているから

        for(Student s : students) {
            s.print();
        }

    }

    /*static void printArray(int[] ar) {
        for (int e : ar) {
            System.out.println(e);
        }
        System.out.println("");
    }*/

    static class Student {
        String name;
        int height;
        int weight;

        Student(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        void print() {
            System.out.printf("name:%s height:%d, weight:%d\n", name, height, weight);
        }
    }


}
