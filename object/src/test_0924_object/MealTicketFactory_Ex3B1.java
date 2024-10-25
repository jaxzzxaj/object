package test_0924_object;

import moremorePolimofizm.CurryTicket;
import moremorePolimofizm.MealTicket;
import moremorePolimofizm.RamenTicket;
import moremorePolimofizm.SushiTicket;

public class MealTicketFactory_Ex3B1 {
	public MealTicket chooseMeal(int num) {
		if(num == 1) {
//			カレーのインスタンス
			CurryTicket cur = new CurryTicket();
			cur.ticketing();
		}else if(num == 2 ) {
//			ラーメンのインスタンス
			RamenTicket ram = new RamenTicket();
			ram.ticketing();
		}else if (num == 3) {
//			寿司のインスタンス
			SushiTicket sus = new SushiTicket();
			sus.ticketing();
//			elseを消すことによって配列外と文字列をcatchにする
		}
		System.out.println("");
		
		return null;
	}
}
