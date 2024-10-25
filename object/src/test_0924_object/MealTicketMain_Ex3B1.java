package test_0924_object;

import java.util.InputMismatchException;
import java.util.Scanner;

import moremorePolimofizm.MealTicketFactory;

public class MealTicketMain_Ex3B1 {

	public static void main(String[] args) {
		//		標準入力から整数を入力する
		System.out.println("メニュー番号を入力してください。\n１：カレー\n\n２：ラーメン\n\n３：寿司\n");
		Scanner s = new Scanner(System.in);

		while (true) {
			try {
			int num = s.nextInt();
			
			//		親クラスのインスタンスを生成する
			MealTicketFactory A1 = new MealTicketFactory();
			//		choosemealのメソッドを呼び出し、その戻り値をインターフェイス型の変数に代入する
			A1.chooseMeal(num);
//			continue;
			}catch(InputMismatchException | ArrayIndexOutOfBoundsException e) {
				System.out.println("メニュー番号を入力してください");
				s.next();
				int num =0;
				break;
			}
			s.close();
			
		}
	}
}