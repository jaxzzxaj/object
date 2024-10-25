package morePolimofizm;

public class ClassInfoMain {

	public static void main(String[] args) {
//		３つのインスタンスを生成し、親型の変数にそれぞれ代入する
		AbstractClassInfo Upper = new HighLevelClass();
		AbstractClassInfo Sport = new SportClass();
		AbstractClassInfo English = new EnglishClass();
//		上記３つのインスタンスのclassInfoメソッドを呼び出す。
//		Upper.info().classes().classmate().club();

		Upper.classInfo();
		Sport.classInfo();
		English.classInfo();
	}

}
