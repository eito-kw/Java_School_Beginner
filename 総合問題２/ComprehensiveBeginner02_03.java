/*
以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
buyDrink() メソッドを持つ、Coffee クラスを使用する
buyDrink() メソッドを持つ、Juice クラスを使用する

バヤリース の オレンジ 味です。130 円になります。
午後の紅茶 の レモンティー 味です。150 円になります。
ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
*/

class Juice {
    String name = "mikan";
    String taste = "apple";

    // ジュースの名前に合わせて結果を表示するメソッド
    public void buyDrink() {
        System.out.println(
            switch (name) {
                case "バヤリース" -> name + " の " + taste + " 味です。 130 円になります。";
                case "午後の紅茶" -> name + " の " + taste + " 味です。 150 円になります。";
                default -> "特定できませんでした";
            }
        );
    }
}

class Coffee {
    String name = "coffee";
    String amasa = "甘め";
    String milk = "無し";

    public void buyDrink() {
        System.out.println(
            switch (name) {
                case "ボス" -> name + " の甘さは " + amasa + "、 ミルク " + milk + "です。 110 円になります。";
                case "ジョージア" -> name + " の甘さは " + amasa + "、 ミルク " + milk + "です。 120 円になります。";
                default -> "特定できませんでした";
            }
        );
    }
}

public class ComprehensiveBeginner02_03 {
    public static void main(String[] args) {
        Juice a001 = new Juice();
        a001.name = "バヤリース";
        a001.taste = "オレンジ";
        a001.buyDrink();

        Juice a002 = new Juice();
        a002.name = "午後の紅茶";
        a002.taste = "レモンティー";
        a002.buyDrink();

        Coffee b001 = new Coffee();
        b001.name = "ボス";
        b001.amasa = "控え目";
        b001.milk = "無し";
        b001.buyDrink();

        Coffee b002 = new Coffee();
        b002.name = "ジョージア";
        b002.amasa = "甘め";
        b002.milk = "入り";
        b002.buyDrink();
    }
}