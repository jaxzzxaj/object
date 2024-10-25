package curriculum;

public class StaticSampleMain {
	public static void main(String[] args) {
//	sはメンバー（フィールド＋メソッド）なので、代入or呼び出し可能
		StaticSample.sField = 787;
		StaticSample.sMethod();
//		iはインスタンスを呼び出ししてから生まれたのでメンバではない＝ゆえに代入と呼び出し不可
		StaticSample s = new StaticSample();
		s.iField = 128;
		s.iMethod();
	}
}
