package test_0924_object;
//インスタンスを作る
public class Test_1_A1_Main {

	public static void main(String[] args) {
//		1.person1A1のインスタンスを生成。
		Test_1_A1_class person1 = new Test_1_A1_class();
		Test_1_A1_class person2 = new Test_1_A1_class();
//		2.インスタンスの各フィールドに、適当な値（年齢は０～１９）を代入する。
		int random1 = new java.util.Random().nextInt(19);
		person1.name ="山田太郎";
		person1.age = random1;
//		3.インスタンスのintroduceメソッドを呼び出す。
		person1.introduce();
//		4.インスタンスのgetOlderメソッドを呼び出す（引数には適当な値を代入する）
		person1.getOlder(10);
//		5.インスタンスのintroduceメソッドとalcoholメソッドを呼び出す。
		person1.introduce();
		person1.alcohol();

	}

}
