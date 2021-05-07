package mvn.proj7;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Anno {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Anno() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Anno [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("start");
	}
	@PreDestroy
	public void end() {
		System.out.println("end");
	}
}
