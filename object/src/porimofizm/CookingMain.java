package porimofizm;

public class CookingMain {

	public static void main(String[] args) {
//		二つの子供のインスタンスを生成し、親の変数をそれぞれ代入する（適当でOK）
		Cooking Co1 = new Bake();
		Co1.foodstuff = "じゃがいも";
		Cooking Co2 = new Boil();
		Co2.foodstuff = "にんじん";
		
//		ingredientsとcookメソッドを呼び出す
		Co1.ingredients();
		Co1.cook();
		Co2.ingredients();
		Co2.cook();
	}

}
