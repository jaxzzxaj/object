package test_0924_object;
//インスタンスを作る（ボタンのほう）
public class Test_1_A4_main {

	public static void main(String[] args) {
//	①heroのインスタンスを生成する。
		Test_1_A4_class heroAttack = new Test_1_A4_class();
//	②インスタンスのactionメソッド（引数なし）を呼び出す。
		heroAttack.action();
//	③インスタンスのactionメソッド（引数に適当な武器を指定）を呼び出す。
		heroAttack.action("ぬいぐるみ");
//	④インスタンスのactionメソッド（引数に適当な武器を指定）を呼び出す。
		heroAttack.action("ダガー", 34);
//	⑤インスタンスのactionメソッド（引数に適当な武器を指定）を呼び出す。
		heroAttack.action(100000, "好きなゲーム１つを初期化");
	}

}
