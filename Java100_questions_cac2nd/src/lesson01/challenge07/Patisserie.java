/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		int y = (int) ((81 * abuy) + (100 * bbuy) + (120 * cbuy));

		System.out.println("合計個数" + x + "個");
		System.out.println("合計金額" + y + "円");

		System.out.println(" をお買いあげですね。\r\n"
				+ " *承りました。");

		int az = (int) (30 - abuy);
		int bz = (int) (30 - bbuy);
		int cz = (int) (30 - cbuy);

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン      \\250 ・・・ 残り" + az + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + bz + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + cz + "個");

	}
}
