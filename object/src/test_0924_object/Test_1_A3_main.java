package test_0924_object;
//インスタンスをつくる（）
public class Test_1_A3_main {

	public static void main(String[] args) {
//		①Animalの配列を生成（長さは５）する。
		Test_1_A3_class[] pet = new Test_1_A3_class[5];
		int random = new java.util.Random().nextInt(500);
//		②コンストラクタを利用してインスタンスを５つ生成（引数には適当な値を指定）
//		し、それぞれ配列の各要素に代入する）
		pet[0] = new Test_1_A3_class("猫", random);
		pet[1] = new Test_1_A3_class("犬", random);
		pet[2] = new Test_1_A3_class("カワウソ", random);	
		pet[3] = new Test_1_A3_class("ハムスター", random);	
		pet[4] = new Test_1_A3_class("リス", random);	
//		③for文を利用し、配列の全要素の情報をinfoメソッドによって表示する。
		for(int i=0; i < pet.length; ++i) {
			pet[i].info();
		}
	}

}
