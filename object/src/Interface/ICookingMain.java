package Interface;

public class ICookingMain {
	public static void main(String[] args) {
//	二つのインスタンスを生成し、本体型の変数にそれぞれ適当な値を代入する
		ICooking A1 = new BoilIF();
		ICooking A2 = new BakeIF();
//		二つのインスタンスのcookを呼び出す
		A2.cook();
		A1.cook();
	}
}