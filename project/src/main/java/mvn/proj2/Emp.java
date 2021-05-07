package mvn.proj2;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Properties;

public class Emp {
	private String name;
	private List<String> phones;
	private List<String> phones2;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties prop;
	
	public String getName() {
		return name;
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses, Properties prop) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.prop = prop;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public List<String> getPhones2() {
		return phones2;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public void setPhones2(List<String> phones2) {
		this.phones2 = phones2;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
