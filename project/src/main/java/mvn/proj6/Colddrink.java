package mvn.proj6;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Colddrink implements InitializingBean, DisposableBean {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Colddrink() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Colddrink [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method");
		
	}

	public void destroy() throws Exception {
		System.out.println("Destroy method");
		
	}
	
}
