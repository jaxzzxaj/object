package chushou;

public class AbstractCookingMain {

	public static void main(String[] args) {
//		二つのABのインスタンスを生成し、親型の変数にそれぞれ代入する
		AbstractCooking A1 = new BackAB();
		A1.foodstuff = "じゃがいも";
		AbstractCooking A2 = new BoilAB();
		A2.foodstuff = "にんじん";
//		二つのインスタンスのingredientsとcookメソッドを呼び出す。
		A1.ingredients();
		A1.cook();
		A2.ingredients();
		A2.cook();

	}

}
