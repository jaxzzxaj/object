package reigaiC1;

public class DrinkSize extends AbstractSize{
	
	protected DrinkSize(String name) {
		super(name);
	}

	public int selectSize() {
		System.out.println("ドリンクのサイズ選択\n\n1:S,2:M,3:L");
		return 0;
	}
}
