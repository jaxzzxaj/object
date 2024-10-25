package test_0924_object;
//クラスを作る（稼働するための燃料と、爆弾の仕組みほう）
public class Test_1_A3_class {
//	フィールド（燃料）
	String animal;
	int length;
	
//コンストラクタを作る
	Test_1_A3_class(String animal, int length){
		this.animal = animal;
		this.length = length;
	}
//	メソッドを作る（爆弾の仕組み）
	void info() {
		System.out.println("この"+ this.animal + "この"+ this.length +"cmです。");
	}
	
}
