package moremorePolimofizm;

public class MealTicketFactory {
	
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
		}
		return null;
	}
}
