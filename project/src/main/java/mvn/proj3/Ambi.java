package mvn.proj3;

public class Ambi {
	private int id;
	private int age;
	
	public Ambi(double id, double age) {
		super();
		System.out.println("double double");
		this.id = (int)id;
		this.age = (int)age;
	}
	public Ambi(String id, String age) {
		super();
		System.out.println("String String");
		this.id = Integer.parseInt(id);
		this.age = Integer.parseInt(age);
	}
	
	public Ambi(int id, int age) {
		super();
		System.out.println("int int");
		this.id = id;
		this.age = age;
	}
	
	
	
	
	public void display() {
		System.out.println(this.id);
		System.out.println(this.age);
	}
	
}
