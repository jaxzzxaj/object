package curriculum;
//爆弾の中身
public class StudentEC{
//このクラス内でしか使えない
//	private int id;
	private String name;
	private String id;
	
//	場所関係なく
	public int getId() {
//		return this.id;
		return Integer.parseInt(id);
}
	public void  setId(int id) {
//		this.id = id;
		this.id = String.valueOf(id);
}
	public String getName() {
		return this.name;
}
	public void setName(String name) {
		this.name = name;
}
	public void introduce() {
		System.out.println("学籍番号："+ this.id);
		System.out.println("氏名："+ this.name);
	}
}