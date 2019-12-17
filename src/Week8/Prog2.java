package Week8;

class Dice{
    int val;
    Dice(int val){
        this.val=val;
    }
    @Override//Overrideすると示すことで、メソッド名を間違えた時、エラーを出してくれる
    public String toString(){//toStringメソッドを上書きしてvalを返すようになった
        return Integer.toString(val);
    }
}
public class Prog2 {

    public static void main(String[] args){
        //member instanceof Student 変数memberの中のオブジェクトがStudent型かそのサブクラスの場合true,それ以外の場合falseを返す
        //abstruct修飾詞　一部未実装を意味する。自分たちが使いやすいように継承して作り替える
        Dice dice=new Dice(5);
        System.out.println(dice);
    }

}
