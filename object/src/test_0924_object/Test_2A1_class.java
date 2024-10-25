package test_0924_object;
//爆弾の中身
public class Test_2A1_class {
//	フィールド（材料）
	private int menu1;
	private int menu2;
	private int menu3;
	private int ppl;
	
//	メソッド
//	料理１個目
	public int getId1() {
		return this.menu1;
	}
	public void setId1(int menu1) {
		this.menu2 = menu1;
	}
	
//	料理１個目
	public int getId2() {
		return this.menu2;
	}
	public void setId2(int menu2) {
		this.menu2 = menu2;
	}
	
//	料理１個目
	public int getId3() {
		return this.menu3;
	}
	public void setId3(int menu3) {
		this.menu3 = menu3;
	}
//	料理１個目
	public int getId4() {
		return this.ppl;
	}
	public void setId4(int ppl) {
		this.ppl = ppl;
	}
	
	public int getAverage() {
		return (getId1() +getId2() +getId3())/ getId4();
	}
	
}
