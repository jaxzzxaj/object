package test_0924_object;
//インスタンス＝爆弾の中身(サブクラスのOOO superを継承）
//継承＝子要素を一緒に使おう！
public class Test_2A2_class extends Test_2A2_super {
//	フィールド
	public String pet2 = "犬";
	
//	メソッド
	public void showPet2() {
		System.out.println("私は"+pet2 +"をいます");
	}
	
	public void showPets() {
		System.out.println("私は"+pet1 + "と" + pet2 + "の両方飼っています");
	}
}
