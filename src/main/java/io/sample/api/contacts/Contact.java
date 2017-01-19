package io.sample.api.contacts;

public class Contact {
	
	private Integer id;
	private String first_name;
	private String last_name;
	private Integer age;
	private String dob;
	private String gender;
	private Integer phone_number;
	private String city;
	private Integer active_flag;
	
	public Contact() {
		
	}
	
	public Contact(Integer id, String first_name, String last_name, Integer age, String dob, String gender,
			Integer phone_number, String city, Integer active_flag) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.phone_number = phone_number;
		this.city = city;
		this.active_flag = active_flag;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getActive_flag() {
		return active_flag;
	}
	public void setActive_flag(Integer active_flag) {
		this.active_flag = active_flag;
	}
	
	
	

}
