package keishoAndConstracter;
//子供
public class FantasyNovel extends Book {
//	フィールド
	public int shohan;
	
//	コンストラクタ
	public FantasyNovel(String genre, String language, int shohan) {
		super (genre, language);
		this.shohan = shohan;
	}
//	メソッド
	@Override
		public void bookinfo() {
			System.out.println("この本は" + this.language + "書かれています。\nこの本の初版は：" + this.shohan+ "年に出版されました");
		}
}
