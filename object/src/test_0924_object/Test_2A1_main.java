package test_0924_object;
//爆弾を起動するほう
public class Test_2A1_main {
	public static void main(String[] args) {
	Test_2A1_class price = new Test_2A1_class();
//	public int getAverage() {
//		Test_2A1_class price = new Test_2A1_class();
		int money1 = new java.util.Random().nextInt(5000);
		price.setId1(money1);
		int money2 = new java.util.Random().nextInt(5000);
		price.setId2(money2);
		int money3 = new java.util.Random().nextInt(5000);
		price.setId3(money3);
		int people = new java.util.Random().nextInt(10);
		price.setId4(people);
		
//	問題の答え
//		price.setId1(2500);
//		price.setId2(4000);
//		price.setId3(120);
//		price.setId4(4);
		
		
		System.out.println(price.getId4() + "人で割り勘した場合、一人あたりの金額は" + price.getAverage() + "（小数点以下切り捨）です。");
		
	}
}
