package threeWayObject;
//親
public class Train {
//	フィールド
	private String route;
	private String type;
	
//	上記のインスタンスの値を取得→配置
	public String getroute() {
		return this.route;
	}
	
	public void setroute(String route) {
		this.route = route;
	}
	
//	コンストラクタ
	public Train(String route, String type) {
		this.route = route;
		this.type = type;
	}
//	メソッド
		public void departure() {
			System.out.println( this.route +"("+ this.type +"系）が発射します。");
		}
		
		public void arrival() {
			System.out.println( this.route +"("+ this.type +"系）が到着します。");
		}
}
