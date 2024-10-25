package Interface;
//実装のための部品
public class BakeIF implements ICooking {
	@Override
	public void cook() {
		System.out.println("焼きます。");
	}
}
