package ex3_A1.pack2;
//Discountを利用する

import ex3_A1.pack1.Discount;

public class DiscountMain {
	public static void main(String[] args) {
//discountクラスのインスタンスを生成
	Discount A1= new Discount();
	
//	インスタンスに適当な値（商品名と値段）を代入する
	A1.setProduct("パソコンラック");
	A1.setPrice(29800);
//	インスタンスのinfoメソッドを呼び出す
	A1.Info();
//	インスタンスのcutInメソッドを呼び出す
	A1.cutIn(3700);
//	インスタンスのinfoメソッドを呼び出す
	A1.Info();
}
}
