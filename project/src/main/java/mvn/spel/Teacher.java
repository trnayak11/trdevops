package mvn.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	@Value("#{5+4}")
	private int x;
	@Value("#{5+4+7}")
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Teacher [x=" + x + ", y=" + y + "]";
	}
	
}
