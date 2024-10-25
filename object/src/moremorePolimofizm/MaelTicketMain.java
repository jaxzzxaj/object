package moremorePolimofizm;

import java.util.Scanner;
public class MaelTicketMain {

	public static void main(String[] args) {
//		標準入力から整数を入力する
		System.out.println("メニュー番号を入力してください。\n１：カレー\n\n２：ラーメン\n\n３：寿司\n");
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
//		親クラスのインスタンスを生成する
		MealTicketFactory A1 = new MealTicketFactory();
//		choosemealのメソッドを呼び出し、その戻り値をインターフェイス型の変数に代入する
		A1.chooseMeal(num);
		
//		上の変数のticketingメソッドを呼び出す
//		MealTicketFactory処理完了
		
		
				
//sをクローズする
		s.close();
	}

}
