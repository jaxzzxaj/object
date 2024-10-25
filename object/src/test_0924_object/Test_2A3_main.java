package test_0924_object;

public class Test_2A3_main {

	public static void main(String[] args) {
//	EmployeeのインスタンスMedicalEmpのインスタンスを生成する（適当な値を指定）
	
//	従業員Aさん
	Test_2A3_class A = new Test_2A3_class();
	A.age = 40;
	A.height = 140.9;
//	医療従事者Bさん
	Test_2A3_subclass B = new Test_2A3_subclass();
//	（？）つながっていない＝継承できない？
	B.age = 100;
	B.height = 160.2;
//	二つのインスタンスを呼び出す
	A.introduce();
	A.info();
//	_（？）B.infoがエラーの理由が不明
	B.introduce();
//	（？）B.info();がないよっていわれているということはclassとsubclassがつながっていない？
	B.info();
	
	}

}
