package morePolimofizm;

public abstract class AbstractClassInfo {
//	メソッド
	public final void classInfo() {
		info();
		classes();
		classmate();
		club();
	}
	
//	クラスの紹介（抽象）
	protected abstract void info();
//	授業内容（抽象）
	protected abstract void classes();
//	男女比率（抽象）
	protected abstract void classmate();
//	部活制限（抽象）
	protected abstract void club();
}
