package day10;


/*
 * 이 클래스는 친구 한명의 데이터를 기억할 클래스 
 * @author 고하늘
 * @since 2022.03.08
 * @version v.1.0
 * 
 */
public class Blackpink {
	private int age;
	private String name,tel,mail,birth,address;
	private char gen;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "Blackpink [ age=" + age + ", name=" + name + ", tel=" + tel + ", mail=" + mail
				+ ", birth=" + birth + ", address=" + address + ", gen=" + gen + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
