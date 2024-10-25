package reigaiC1;

public class OrderMain {

	public static void main(String[] args) {
		System.out.println("メニューのサイズを選んでください\n");
//		Hamberger（）の中に何もいれないとエラーが起きる
//		why:hamburgerクラスにabstractSizeにextendしていて、extend先に値を取得せよと戻り値を設定してるから（Scaneｒを使わずに）
		AbstractSize a1 = new HamburgerSize("アボカドチーズバーガー");
		a1.selectSize();
		
		
		

	}

}
