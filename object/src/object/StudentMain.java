package object;
//メソッドの呼び出し方法

public class StudentMain {
	int id;
	String name;
	//Main（）メソッドで箱をつくる
	public static void main(String[] args) {
//	インスタンスを生成して、変数Stdへ入れる
		StudentCS std1 = new StudentCS();
		StudentCS std2 = new StudentCS();
//	変数Stdの中に（：値）を入れる
		std1.id = 1001;
		std1.name = "山田太郎";
		std2.id = 2001;
		std2.name = "山田太郎";
//	変数Stdの中身をそれぞれ呼び出す
		std1.introduce();
		std2.introduce();
	}
}