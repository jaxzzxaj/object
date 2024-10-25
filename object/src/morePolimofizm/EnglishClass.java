package morePolimofizm;

public class EnglishClass extends AbstractClassInfo{
@Override
	protected void info() {
		System.out.println("英語クラスは英語の授業に特化したクラスです");
	}
	
@Override
	protected void classes() {
		System.out.println("英語の授業は英語で行います");
	}
	
@Override
	protected void classmate() {
		System.out.println("８割が女子です");
	}
	
@Override
	protected void club() {
		System.out.println("部活の参加は自由です");
	}
}
