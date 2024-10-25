package test_0924_object;
//メソッドのほうをつくる（燃料と爆弾のほう）
public class Test_1_A5_class {
//	フィールド
	String name;
	int id;
//	Integer id2;　⇔プリミティブ型（数字の箱）ではないクラスらしい
	
//	コンストラクタ
	Test_1_A5_class(String name, int id){
		this.name = name;
		this.id = id;
		}
//	メソッド
	void message() {
		System.out.println("ようこそ、" + this.name + "さん。\nあなたのユーザーIDは＜" +this.id + "＞です。");
	}
}
