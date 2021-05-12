package mvn.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	@Value("#{5+4}")
	private int x;
	@Value("#{5+4+7}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{new java.lang.String('NSZ highschool sunderpur')}")
	private String school;
	@Value("#{8>3}")
	private boolean isActive;
	
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
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
		return "Teacher [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", school=" + school + ", isActive="
				+ isActive + "]";
	}
	
	
	
}
