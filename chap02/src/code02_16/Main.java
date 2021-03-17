package code02_16;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextInt();
		int age = Integer.parseInt(ageString);
		int fotune = new java.util.Random().nextInt(4);
		*/

		//練習問題１
		int a = new java.util.Random().nextInt(7);
		int b = new java.util.Random().nextInt(7);
		int win = Math.max(a, b);
		System.out.println
		(a + "と" + b + "は、" + win + "のほうが大きいので、" + win + "の勝ち");

	}

}
