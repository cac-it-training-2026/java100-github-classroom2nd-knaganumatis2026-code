package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		String[] s = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎", "原宿", "品川",
				"目白", "大塚", "上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨",
				"高輪ゲートウェイ" };

		boolean[] stationFlag = new boolean[s.length];

		// 配列の要素を全てtrueで初期化しておく
		Arrays.fill(stationFlag, true);

		System.out.println("「※※※ 山手線ゲーム ※※※」");
		System.out.println("「      ゲームスタート！    」");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// コンピュータの回答の準備
		Random rand = new Random();

		// 正解した時にtrueとなるフラグ
		boolean hitFlag = false;

		// ゲームの実行回数（プレイヤーとコンピュータがそれぞれ回答する度にプラス１）
		int gameCount = 0;
		do {
			// プレイヤーに駅名を入力してもらう
			String inputStationName = reader.readLine();

			// プレイヤーの入力した駅名がOKかどうかを判定するための繰り返し（駅の総数まで繰り返す）
			for (int i = 0; i < s.length; i++) {

				// プレイヤーの入力した駅名が配列に含まれていれば
				if (s[i].equals(inputStationName)) {

					// / その番号の駅が既出でないか判定する
					if (stationFlag[i]) {

						// 正解したという目印にフラグを立てる
						hitFlag = true;

						// この駅名はもう答えましたという意味でfalseに変えておく
						stationFlag[i] = false;

						// 内側のループを抜ける
						break;

						// 入力した駅名が既出であればゲームオーバー
					} else {

						// 内側のループを抜ける
						break;
					}
				}
			}

			// ゲームの実行回数を一つ増やす
			gameCount++;

			// プレイヤーが誤答した場合または全ての駅名が出尽くした場合
			if (!hitFlag || (gameCount == s.length)) {

				// 外側のループを抜けて終了処理へ
				break;
			}

			// フラグをクリアしておく
			hitFlag = false;

			// コンピュータが回答するための繰り返し（正解するまで繰り返す）
			while (!hitFlag) {

				// 総駅数の範囲で乱数を取得
				int num = rand.nextInt(s.length);

				// その番号の駅が既出でないか判定する
				if (stationFlag[num]) {

					// 既出でなければ駅名を出力する
					System.out.println(s[num]);

					// この駅名はもう答えましたという意味でfalseに変えておく
					stationFlag[num] = false;

					// 正解したという目印にフラグを立てる
					hitFlag = true;
				}
			}

			// ゲームの実行回数を一つ増やす
			gameCount++;

			// フラグをクリアしておく
			hitFlag = false;

			// 駅名が出尽くした場合ループを抜ける
		} while (gameCount != s.length);

		// 駅名が出尽くしていればプレイヤーの勝ち、そうでなければ負け
		if (gameCount == s.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}
}
