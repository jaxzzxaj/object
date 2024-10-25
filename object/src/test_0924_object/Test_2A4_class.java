package test_0924_object;

public class Test_2A4_class {
//	フィールド
	protected String genre;
	protected String language;
	
//	コンストラクタ
	public Test_2A4_class(String genre, String language){
		this.genre = genre;
		this.language = language;
		
	}
	
//	メソッド
	public void bookInfo() {
		System.out.println("この本は" +this.language + "で書かれています");
	}
}
