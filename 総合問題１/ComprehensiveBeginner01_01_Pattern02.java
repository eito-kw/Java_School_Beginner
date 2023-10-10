//整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成してください。

import java.util.Scanner;

public class ComprehensiveBeginner01_01_Pattern02 {
    public static void main(String[] args){
        
        // キーボードから数字を入力してもらう
        //キーボード入力準備
        Scanner sc = new Scanner(System.in);

        //誤入力を防ぐためループ

        int num = 0;
        int seisu = 0;

        while (num < 1) {
            System.out.println("整数を入力してください");

            // 入力されたデータが整数かどうかチェック
            if (sc.hasNextInt()) {
                //整数である場合入力
                seisu = sc.nextInt();
                num += 1;
            } else {
                // 整数以外の場合、向こうなデータなのでやり直し
                System.out.println("【エラー】入力できるのは整数だけです");
                // 不要なトークンをバッファから取り除く
                sc.next();
            }
        }

        // 偶数か奇数の判定を行う
        String kotae = Judge(seisu);

        // 結果を表示する
        showResult(kotae);

        sc.close();// スキャナーオブジェクトを閉じる
    }
    
    private static String Judge(int seisu) {
        String kotae = ""; //判定結果を保存する
        if (seisu % 2 == 0) {
            kotae = "even";
        } else {
            kotae = "odd";
        }

        // 結果を返す
        return kotae;
    }

    private static void showResult(String kotae) {
        //結果を表示
        System.out.println(kotae);
    }
}