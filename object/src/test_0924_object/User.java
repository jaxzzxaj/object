package test_0924_object;
//クラスを作る（燃料と爆弾の仕組みのほう）
public class User {
//	フィールド
	String name;
	int id;
	
//	コンストラクタ
	User(String name, int id) {
	this.name = name;
	this.id =id;
	}
	
	User(){
	}
	
//	メソッド
	void message(String name, int id ) {
		if (id < 0) {
		System.out.println("ようこそ、" + this.name + "さん。");
		System.out.println("あなたのユーザIDは＜、" + this.id + "＞です。");
		}else {
			System.out.println("終了");
		}
	}
}
