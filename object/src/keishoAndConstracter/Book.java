package keishoAndConstracter;
//親
public class Book {
//	フィールド
	protected String genre;
	protected String language;
	
//	コンストラクタ
	public Book(String genre, String language) {
		this.genre = genre;
		this.language = language;
	}
	
//	メソッド
	public void bookinfo() {
		System.out.println("本のジャンルは：" + this.genre +"本の言語は：" + this.language);
	}
}
