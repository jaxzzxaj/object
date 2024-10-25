package reigaiC1;
//サイズ選択（抽象クラス）
public abstract class  AbstractSize {
//	フィールド(商品名）
	private String name;
	
	public String getName() {
		return this.name;
	}
	
//	コンストラクタ
	protected AbstractSize(String name) {
		this.name = name;
	}
//	メソッド
	public abstract int selectSize(); 
}
