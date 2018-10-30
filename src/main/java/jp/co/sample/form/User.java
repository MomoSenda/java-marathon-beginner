package jp.co.sample.form;

/**
 * ユーザー情報を受け取るフォーム
 * @author momo.senda
 *
 */
public class User {
	/** 名前 */
	private String name;
	/** 年齢 */
	private String age;
	/**　住所 */
	private String address;
	
	@Override
	public String toString() {
		return "UserinfoForm [name=" + name + ", age=" + age + ", address=" + address + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
