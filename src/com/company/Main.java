package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        //配列のインスタンスを生成.大きさ（収納可能な要素の数）は3とする
        int[] ar = new int[3];

//配列インスタンスに対しては，[]を用いて要素にアクセスできる.要素番号(index)は0から始まる
//要素数3の配列の，indexは，0,1,2のいずれかである
        ar[0] = 0;
        ar[1] = 10;
        ar[2] = 20;

//配列インスタンス.lengthで配列の長さ（要素数）を取得できる
        for (int i=0; i<ar.length; i++) {
            System.out.println(ar[i]);
        }


    }
}
