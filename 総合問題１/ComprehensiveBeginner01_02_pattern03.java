//整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。

import java.util.Scanner;

public class ComprehensiveBeginner01_02_pattern03 {
    public static void main(String[] args) {

        //キーボード入力準備
        Scanner sc = new Scanner(System.in);

        // キーボードから整数を３つ入力してもらう
        int[] seisu = new int[3];

        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.println((i + 1) + "つ目の整数を入力してください");
                    seisu[i] = Integer.parseInt(sc.next());
                    break; // 入力が整数であればループを抜ける
                } catch (NumberFormatException e) {
                    // 整数以外の場合、エラーメッセージを表示し、次のループで再度入力を求める
                    System.out.println("【エラー】入力できるのは整数だけです。入力し直してください");
                }
            }
        }

        // 小さい順から並んでいるか判定を行う
        String result = judgement(seisu[0], seisu[1], seisu[2]);

        // 結果を表示する
        System.out.println(seisu[0] + "," + seisu[1] + "," + seisu[2]);
        System.out.println(result);
        sc.close();
    }

    private static String judgement(int seisu1, int seisu2, int seisu3) {

        String kotae = ""; // 結果を保存する

        if (seisu1 <= seisu2 && seisu2 <= seisu3) {
            kotae = "OK";
        } else {
            kotae = "NG";
        }

        // 結果を返す
        return kotae;
    }
}
