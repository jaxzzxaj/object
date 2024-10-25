package chushou;
//親
public abstract class AbstractCooking {
//	フィールド
	public String foodstuff;
	
//	コンストラクタなし
	
//	メソッド
	public void ingredients() {
		System.out.println("食材は"+ foodstuff + "です。");
	}
	
	abstract void cook();
}