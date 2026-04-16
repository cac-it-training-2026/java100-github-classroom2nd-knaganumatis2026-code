/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String abuyStr = reader.readLine();
		int abuy = Integer.parseInt(abuyStr);

		System.out.print("ショコラ      >");
		String bbuyStr = reader.readLine();
		int bbuy = Integer.parseInt(bbuyStr);

		System.out.print("ピスタージュ      >");
		String cbuyStr = reader.readLine();
		int cbuy = Integer.parseInt(cbuyStr);

		System.out.println("シトロン     " + abuy + "個");
		System.out.println("ショコラ     " + bbuy + "個");
		System.out.println("ピスタージュ " + cbuy + "個");

		System.out.println("合計個数" + (abuy + bbuy + cbuy) + "個");
		System.out.println("合計金額" + ((8 * abuy) + (10 * bbuy) + (12 * cbuy)) + "円");

		System.out.println(" をお買いあげですね。\r\n"
				+ " *承りました。");

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン      \\250 ・・・ 残り" + (30 - abuy) + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + (30 - bbuy) + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + (30 - cbuy) + "個");

	}
}
