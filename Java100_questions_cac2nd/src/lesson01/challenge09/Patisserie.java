/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String abuyStr = reader.readLine();
		double abuy = Double.parseDouble(abuyStr);

		System.out.print("ショコラ      >");
		String bbuyStr = reader.readLine();
		double bbuy = Double.parseDouble(bbuyStr);

		System.out.print("ピスタージュ      >");
		String cbuyStr = reader.readLine();
		double cbuy = Double.parseDouble(cbuyStr);

		System.out.println("シトロン     " + abuy + "個");
		System.out.println("ショコラ     " + bbuy + "個");
		System.out.println("ピスタージュ " + cbuy + "個");

		double x = (abuy + bbuy + cbuy);

		int ag = (int) (81 * abuy);
		int bg = (int) (100 * bbuy);
		int cg = (int) (120 * cbuy);

		int y = (int) (ag + bg + cg);

		System.out.println("合計個数" + x + "個");
		System.out.println("合計金額" + y + "円");

		System.out.println(" をお買いあげですね。\r\n"
				+ " 承りました。");

		int az = (int) (30 - abuy);
		int bz = (int) (30 - bbuy);
		int cz = (int) (30 - cbuy);

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン      \\250 ・・・ 残り" + az + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + bz + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + cz + "個");

		System.out.println("閉店時間となりました。\r\n"
				+ "  またのお越しをお待ちしております。");

		System.out.println("売り上げ割合" + "\n売り上げ合計　　　\\" + y);

		System.out.println("内訳");
		System.out.println("シトロン\\" + ag + "・・・" + ((ag * 100) / y) + "%");
		System.out.println("ショコラ\\" + bg + "・・・" + ((bg * 100) / y) + "%");
		System.out.println("ピスタージュ\\" + cg + "・・・" + ((cg * 100) / y) + "%");

		System.out.println("明日の三色マカロンの配合率が決まりました！");

		System.out.println("シトロンの味    ・・・ " + ((ag * 100) / y) + "%");
		System.out.println("ショコラの味    ・・・ " + ((bg * 100) / y) + "%");
		System.out.println("ピスタージュの味    ・・・ " + ((cg * 100) / y) + "%");

		System.out.println("\nが楽しめます");

		System.out.println("価格" + (y / (int) x));

	}
}
