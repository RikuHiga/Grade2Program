/*package Week10;

abstract class TalkingAnimal
{
    abstract void talk() ;//呼び出される時点でエラー
}

class TalkingDog extends TalkingAnimal
{
    @Override  //このメソッドがオーバーライドを意図している事をコンパイラに知らせるマーク
    void talk() {
        System.out.println("こんにちわん");
    }
}

class OyajiDog extends TalkingAnimal
{
    @Override
    void talk() {
        System.out.println("モード系な盲導犬，犬神家の犬が三毛．");
    }
}

class Main {
    static void hearTalking(TalkingAnimal animal) {
        animal.talk();
    }

    public static void main(String[] args) {
//        TalkingAnimal dog_a = new TalkingDog();
//        TalkingAnimal dog_b = new OyajiDog();

        hearTalking(new TalkingDog());
        hearTalking(new OyajiDog());

//        dog_a.talk();
//        dog_b.talk(); //呼び出しコードは同じだが処理は異なる(インスタンスの型によって決まる)
    }
}*/

