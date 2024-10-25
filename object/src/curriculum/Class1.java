package curriculum;

public class Class1 {
//	自分が使う領域のみ使用可能（cｌass１=同じクラスのみ）
//	private void method１() {
//		System.out.println("やあ");
//	}
//	同じパッケージ内のクラス、またはサブクラスのみ
	protected void method２() {
		System.out.println("やあ２");
	}
//	同じパッケージないのクラスのみ
	void method３() {
		System.out.println("やあ３");
	}
//	すべてのクラス・パッケージ関係ない
	public void method４() {
		System.out.println("やあ４");
	}
}
