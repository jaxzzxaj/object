package reigaishori;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionEx3_A2 {

	public static void main(String[] args) {
		String[]a = {"りんご", "みかん", "さくらんぼ", "桃" , "梨"};
		System.out.println("参照したいデータのインデックスを入力して下さい：");
		
		try {
//			発生場所のみでOK（表現しなくてもいいらしい）
			Scanner sc = new Scanner(System.in);
			int index = sc.nextInt();
			System.out.println(index + ":"+a[index]);
//			こっちに発生場所の問題の表現をする
//			種類にないものはスルーせず、対応しなければならない（infoはない）
		}catch(InputMismatchException b) {
			System.out.println("インデックスは整数で入力してください");
//			続ける方法ある？
		}catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("お探しのインデックスは存在しません");
		}
		
	}
}