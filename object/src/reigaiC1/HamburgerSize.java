package reigaiC1;

public class HamburgerSize extends AbstractSize {
	
	protected HamburgerSize (String name) {
		super(name);
	}
	public int selectSize() {
//		String burger;
//		burger = this.getName();
		
//		どうしてthis.nameではだめなのか、どうしてnameではだめなのか
//		privateだから、格納された箱を指定するから
		System.out.println(this.getName()+"\n");
		System.out.println("1:シングル、2:ダブル\n");
		return 0;
	}
}
