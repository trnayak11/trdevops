package mvn.proj5;

public class Life {
	
	public static void println(Object line) {
	    System.out.println(line);
	}
	
	private double id;
	
	public double getId() {
		return id;
	}

	public void setId(double id) {
		println("setting id");
		this.id = id;
	}

	public Life() {
		super();
	}

	@Override
	public String toString() {
		return "Life id=" + id;
	}
	public void init() {
		println("inside init method");
	}
	public void destroy() {
		println("inside destroy method");
	}
}
