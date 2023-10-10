/*
スロットマシーンプログラムを作成してください。
"ゾロ目で大当たり！チャンスは30回"と表示させる
"begin と入力してください> " と入力すると、開始するようにする
ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
*/

import java.util.Random;

import java.util.Scanner;

public class ComprehensiveBeginner02_01 {
    public static void main(String[] args) {

        System.out.println("ゾロ目で大当たり！チャンスは30回");

        //biginと入力されれば次へ進む
        Scanner sc = new Scanner(System.in);

        int num = 0;
        String var01 = "";

        System.out.println("beginと入力してください> ");

        while (num < 1) {

            var01 = sc.nextLine();

            if ("begin".equals(var01)) {
                num += 1;
            } else {
                // begin以外の入力がされた場合、無効なのでやりなおし
                System.out.println("begin以外の入力は無効です。やり直してください。");
                // 不要なトークンをバッファから取り除く
                continue;
            }
        }

        //スロットを３０回回して表示させる。当たれば終わる。

        for (int i = 1; i <= 30; i++) {
            Random rand = new Random();
            int left = rand.nextInt(10);
            int center = rand.nextInt(10);
            int right = rand.nextInt(10);
            if (left == center && center == right) {
                System.out.println(i + "回目 :" + left + "" + center + "" + right);
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                break; // ここでループを終了
            } else {
                if (i == 30) {
                    System.out.println(i + "回目 :" + left + "" + center + "" + right);
                    System.out.println("残念でした。終わります。");
                } else {
                    System.out.println(i + "回目 :" + left + "" + center + "" + right);
                }
            }
        }
        sc.close();
    }
}