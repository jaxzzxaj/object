package test_0924_object;
//クラスを作る（燃料と爆弾のほう）
public class Test_1_A4_class {
//	メソッドをつくる（爆弾の仕組みのほう）

//攻撃
	void action() {
		System.out.println("敵に攻撃をする");		
	}
//	weaponで攻撃
	void action(String weapon) {
		System.out.println(weapon +"で敵に攻撃をする");		
	}
//	weaponで攻撃＋ダメージ
	void action(String weapon, int damage) {
		System.out.println(weapon + "で敵に攻撃をする。敵に"+ damage +"のダメージ！");		
	}
	
//	（weaponで攻撃＋ダメージ）を３回繰り返す
//	確かdo{}while();は必ず一回実行する気がする。。
	int i = 0;
	void action(int damage, String weapon) {
		do{
		System.out.println(weapon + "で敵に攻撃をする。敵に"+ damage +"のダメージ！");
		++i;
	}while(i < 3);
	}
}
