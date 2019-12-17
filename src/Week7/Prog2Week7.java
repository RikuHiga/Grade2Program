package Week7;

import java.io.FileWriter;//Exception1.java 指定したファイル名に書き込みができる。throwでIOExceptionを投げるため強制的にtry-catchを書かせる
import java.io.IOException;

public class Prog2Week7 {

    //Exception1.java 例外処理を書かなければIOエラーが出る
    public static void main(String[] args){
        try{//例外が発生する可能性のある場所をtryでかこむ
                // try-catchなしのコード。
                FileWriter fw = new FileWriter("output.txt");//デフォルトはプロジェクトファイル直下
                String[] results = {"ほげ", "ふ"};
                for(String temp: results){
                    fw.write(temp);
                }
                fw.close();
                //throw new IOException(); //これを書くと無理やりIOExeptionを発生させる
        }catch(IOException e){//例外 IOExceptionが発生した場合に実行される処理 catch構文は複数可
            System.out.println("例外IOExeptionが発生しました");
            System.out.println(e.getMessage());//eで起きたエラー分を取得する
        }finally {
            //例外が起きた際、一番最後に必ず処理したい
            System.out.println("最終処理");
        }
    }
}


