package morePolimofizm;

public class HighLevelClass extends AbstractClassInfo  {
	@Override
	protected void info() {
		System.out.println("特進クラスは難解大学を目指す人のためのクラスです");
	}
	
	@Override
	protected void classes() {
		System.out.println("授業の内容はとても難しいです。");
	}
	
	@Override
	protected void classmate() {
		System.out.println("文系・理系によって男女比は異なります。");
	}
	
	@Override
	protected void club() {
		System.out.println("時間割が過密なため部活の参加はほぼできません。\n\n");
	}
}
