/**
2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。
*/

import java.util.Scanner;

public class ComprehensiveBeginner01_03_Pattern03 {
    public static void main(String[] args) {

        System.out.println("2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力してください");

        // キーボード入力準備
        Scanner sc = new Scanner(System.in);

        // キーボードから整数を３つ入力してもらう
        int[] seisu = new int[3];
        String[] coeffNames = { "a", "b", "c" };

        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.println(coeffNames[i] + "を入力してください");
                    seisu[i] = Integer.parseInt(sc.next());
                    break; // 入力が整数であればループを抜ける
                } catch (NumberFormatException e) {
                    // 整数以外の場合、エラーメッセージを表示し、次のループで再度入力を求める
                    System.out.println("【エラー】入力できるのは整数だけです。入力し直してください");
                }
            }
        }

        // 2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別する
        Hanbetu(seisu[0], seisu[1], seisu[2]);

        //スキャナーオブジェクトを閉じる
        sc.close();
    }

    private static void Hanbetu(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.print("２つの実数解");
        } else if (d == 0) {
            System.out.print("重解");
        } else {
            System.out.println("虚数解");
        }
    }
}