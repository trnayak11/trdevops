package mvn.proj4;

public class Ref1 {
	private int x;
	private Ref2 ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public Ref2 getOb() {
		return ob;
	}
	public void setOb(Ref2 ob) {
		this.ob = ob;
	}
	public Ref1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ref1 [x=" + x + ", ob=" + ob + "]";
	}
	
}
