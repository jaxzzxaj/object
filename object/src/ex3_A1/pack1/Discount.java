package ex3_A1.pack1;
//値引き
public class Discount {
//	フィールド
	private String product;
	private int price;
	
//	商品を取得・配置する（get/set)
	public String getProduct() {
		return  this.product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
//	価格の取得・配置する（get/set)
	public int getPrice() {
		return this.price;
	}
	public void  setPrice(int price) {
		this.price = price;
	}
	
//	メソッド
	public void Info() {
		int cut =0;
		System.out.println("これは" + this.product +"です");
		System.out.println("値段は"+ (this.price - cut)+"円です。");
	}
	public void cutIn(int cut) {
		this.price -=cut;
		System.out.println("決算セールで"+ cut +"円値引きされます。");
		
	}

}
