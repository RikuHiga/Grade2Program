package Week8;

/*
class Array<T> {//Tは一時的な型名で、インスタンス化するときに指定された型に変化する
    Object[] data; //実際に値を保存する配列。ここはObject型でないといけない
    int index;  //現在の末尾の位置を保存する
    final int MAX_SIZE = 100; //追加可能な最大要素数

    //コンストラクタ．引数は配列の大きさ
    Array() {
        data = new Object[MAX_SIZE];
        index = 0; //最初は空なので末尾は0
    }

    //末尾に要素を追加するメソッド
    void add(T value) {
        data[index] = value;
        index += 1;
    }

    //要素を取得するメソッド
    T get(int index) {
        return (T) data[index];
    }

    //配列の全要素をprint
    void print() {
        for(int i=0; i<index; i++) {
            System.out.println(get(i));
        }
    }
}


public class Prog2Exam {
    public static void main(String[] args) {
        var array = new Array<String>();//String用の配列クラスのインスタンスを生成。クラスでないといけないので、int型はIntegerとなる

        array.add("Taro");//要素の追加
        array.add("Jiro");
        array.add("Saburo");
        //array.add(10); //これはエラー.T = Stringなので引数の型が異なる
        array.print(); //全要素をprint

        var int_array = new Array<Integer>(); //int用の配列を作る
        int_array.add(10); //T = Integerなので．これはOK
        //intからIntegerのインスタンへは暗黙に変換される

        int_array.print();
    }


}*///ジェネリクスを使った配列にaddするメソッドを作った
import java.util.ArrayList; //ArrayListを利用するためにはファイル先頭にこの記述が必要

public class Prog2Exam {
    static <T> void allPrint(ArrayList<T> array){//ループさせてprintするのをメソッドとして共通化した
        for(var e :array){
            System.out.println(e);
        }
    }
{}    public static void main(String[] args) {

        var str_array = new ArrayList<String>(); //String用のArrayList
        str_array.add("Taro");//末尾に追加
        str_array.add("Jiro");

        //全要素をprint. 配列同様，拡張for文が使える
        for(var e : str_array) {
            System.out.println(e);
        }

        var int_array = new ArrayList<Integer>();//int用のArrayList
        int_array.add(10);//末尾に追加
        int_array.add(20);
        int_array.add(30);

        allPrint(int_array);
    }
}

