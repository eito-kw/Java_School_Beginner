/**
とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
人数を入力し、入場料の合計を計算するプログラムを作成してください。
*/

import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        // キーボード入力準備
        Scanner sc = new Scanner(System.in);

        // キーボードから整数を１つ入力してもらう

        //誤入力を防ぐためループ

        int num = 0;
        int seisu = 0;

        while (num < 1) {

            System.out.println("人数分の数字を入力してください");

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

        // 入場料の合計を各パターンごとに計算して表示させる

        Keisan(seisu);

        sc.close();
    }

    private static void Keisan(int seisu) {

        if (seisu >= 1 && seisu <= 4) {
            System.out.println((seisu *= 600) + "円");
        } else if (seisu >= 5 && seisu < 20) {
            System.out.println((seisu *= 550) + "円");
        } else if (seisu >= 20 ) {
            System.out.println((seisu *= 500) + "円");
        } else if (seisu == 0) {
            System.out.println("0円");
        } else {
            System.out.println("【エラー】もう一度やりなおしてください");
        }
    } 
}