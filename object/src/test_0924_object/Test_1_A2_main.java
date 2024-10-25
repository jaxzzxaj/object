package test_0924_object;
//メインを作る（火をつける側）
public class Test_1_A2_main {
	public static void main(String[] args) {
//	①person1A2のインスタンスを生成する（コンストラクタの引数には適当な値を代入する）。
		int random = new java.util.Random().nextInt(100);
		Test_1_A2_class person1 = new Test_1_A2_class("クリス", random);
//	②インスタンスのintroduceメソッドを呼び出す。
		person1.introduce();
//	③インスタンスのgetOlderメソッドを呼び出す。(引数には適当な値を代入する。)
		person1.getOlder(10);
//	④インスタンスのintroduceメソッドを呼び出す。
		person1.introduce();

	}
}
