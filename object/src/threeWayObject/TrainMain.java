package threeWayObject;

public class TrainMain {

	public static void main(String[] args) {
//		親のインスタンスを生成する（引数は適当な数値でOK）
		Train A1 = new Train ("中山道幹線","２１１");
//		親のインスタンスのdepartureとarrivalのメソッドを呼び出す
		A1.departure();
		A1.arrival();
//		子供のインスタンスを生成、親型の変数を代入する
		Train A2 = new BulletTrain("成田新幹線", "");
//		子供型のインスタンスのdepartureとarrivalのメソッドを呼び出す
		A2.departure();
		A2.arrival();
	}

}
