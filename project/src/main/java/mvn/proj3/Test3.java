package mvn.proj3;

public class Test3 {
	private int id;
	private String name;
	private Cert certi;
	public Test3(int id, String name, Cert certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}

	public int display() {
		return id;
	}
	
	@Override
	public String toString() {
		return this.name +" : " + this.certi;
	}
}
