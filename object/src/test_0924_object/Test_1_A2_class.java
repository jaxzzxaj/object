package test_0924_object;
//クラスを作る：
public class Test_1_A2_class {
//フィールドを作る
	String name;
	int age;
//	コンストラクタを作る
	Test_1_A2_class(String name, int age){
		this.name = name;
		this.age = age;
	}
//	メソッドを作る(爆弾側）
	void introduce() {
		System.out.println("私は"+ this.name + "です。");
		System.out.println("私は"+ this.age + "です。");	
	}
	void getOlder(int years) {
		this.age = age + years;
		System.out.println("[" + years + "年後]");
	}
	
	
	
}
