/**
九九の表を、2重の繰り返し(2重for文)を使って表示するプログラムを作成してください。
2重の繰り返しを使わず単に表示するのは NG
*/


public class ComprehensiveBeginner01_05 {
    public static void main(String args[]) {
        //九九の計算
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1) {
                    System.out.print(i + " × " + j);
                } else {
                    System.out.print(", " + i + " × " + j);
                }
            }
            //改行
            System.out.println();
        }
    }
}