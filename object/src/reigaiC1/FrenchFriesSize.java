package reigaiC1;

public class FrenchFriesSize extends AbstractSize {
	
	protected FrenchFriesSize(String name) {
		super(name);
	}

	
	public int selectSize() {
		System.out.println("ポテトのサイズ選択\n\n1:S,2:M,3:L");
		return 0;
	}

}
