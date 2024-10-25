package morePolimofizm;

public class SportClass  extends AbstractClassInfo {
	@Override
	protected void info() {
		System.out.println("スポーツクラスはスポーツ推薦入学者のクラスです");
	}
	
	@Override
	protected void classes() {
		System.out.println("授業の内容は比較的優しいです");
	}
	
	@Override
	protected void classmate() {
		System.out.println("７割が男子です");
	}
	
	@Override
	protected void club() {
		System.out.println("部活は入学時の推薦枠によって必ず参加です\n\n");
	}
}
