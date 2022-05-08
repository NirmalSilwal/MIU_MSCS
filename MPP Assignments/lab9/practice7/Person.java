package lab9.practice7;

import java.util.ArrayList;
import java.util.List;

public class Person  {
	
	private String name;
	private String phone;
	private int age;
	private List<Role> roles;
	
	
	Person(String name, String phone, int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.roles = new ArrayList<Role>();
	}
	
	public void addRole(Role r) {
		this.roles.add(r);
	}
	public List<Role> getRoles(){
		return roles;
	}
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", age=" + age + ", roles=" + roles + "]";
	}
	

}
