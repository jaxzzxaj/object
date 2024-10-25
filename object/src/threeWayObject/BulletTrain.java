package threeWayObject;
//子供
public class BulletTrain  extends Train{
//	フィールドなし
	
//	コンストラクタ
	public BulletTrain(String route, String type) {
		super(route, type);
	}
//	メソッド
	@Override
	public void departure() {
		System.out.println( getroute() +"が始発駅から発射します。");
	}
	@Override
		public void arrival() {
		System.out.println( getroute() +"が終点駅へ到着します。");
	}
}
