/*
"ジャンケン"と表示させる
"0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
それ以外の数字が入力された場合、エラーとして説明した後に 1. に戻るようにする
今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する
*/

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {

        // キーボードから数字を入力してもらう
        // キーボードの入力準備
        Scanner sc = new Scanner(System.in);

        //誤入力を防ぐためのループ

        int num = 0;
        int seisu = 0;

        while (num < 1) {
            System.out.println("ジャンケン");
            System.out.println("0:グー 1:チョキ 2:パー >数字を入力してください");

            //入力されたデータが整数かどうかチェック
            if (sc.hasNextInt()) {
                //整数である場合入力
                seisu = sc.nextInt();
                if (seisu < 3 && seisu >= 0) {
                    num += 1;
                } else {
                    System.out.println("【エラー】0~2の整数を入力してください");
                }
            } else {
                //整数以外の場合、無効なデータなのでやり直し
                System.out.println("【エラー】入力出来るのは整数だけです");
                //不要なトークンをバッファから取り除く
                sc.next();
            }
        }
        //ジャンケンメソッド
        int aite = new Random().nextInt(3);

        String[] hand = { "グー", "チョキ", "パー" };

        System.out.println("相手 " + hand[aite] + " あなた " + hand[seisu]);

        janken(seisu, aite);
        sc.close();
    }

    private static void janken(int seisu, int aite) {
        if ((seisu == 0 && aite == 1) || (seisu == 1 && aite == 2) || (seisu == 2 && aite == 0)) {
            System.out.println("あなたの勝ちです");
        } else if ((seisu == 0 && aite == 2) || (seisu == 1 && aite == 0) || (seisu == 2 && aite == 1)) {
            System.out.println("あなたの負けです");
        } else {
            System.out.println("あいこです");
        }
    }
}