package Interface;
//実装のための部品
public class BoilIF implements ICooking {
	@Override
	public void cook() {
		System.out.println("煮ます。");
	}
 
}
