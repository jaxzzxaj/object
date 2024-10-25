package test_0924_object;
//クラス：を作る
public class Test_1_A1_class {
//フィールド
	String name;
	int age;
//メソッド：自己紹介
	void introduce() {
		System.out.println("私は" + name + "です。\n年齢は" + age + "です。");
		
	}
//	メソッド：加算する年齢
	void getOlder(int years) {
		age += years;
		System.out.println("["+ years +"年後]");
	}
	void alcohol() {
		if (age > 20 ) {
			System.out.println("飲酒できる年齢です\n\n");
		}else {
			System.out.println("まだ飲酒できる年齢ではありません\n\n");
		}
	}
}
