package com.example.validation.ValidationProject.entity;

import com.example.validation.ValidationProject.ValidateNationality;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="user_tbl")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Integer id;
	@Column
	@NotNull(message="Name Shouldn't null")
	private String name;
	@Column
	@Pattern(regexp="^\\d{10}$")
	private String mobile;
	@Column
	@Email(message="Email Id Is Not Correct")
	private String email;
	@Column
	@NotEmpty(message="Gender Shouldn't Null Or Empty")
	private String gender;
	@Column
	@Min(18)
	@Max(65)
	private int age;
	@Column
//	@NotEmpty(message="Nationality Shouldn't Null Or Empty")
	//IND/USA
	@ValidateNationality
	private String nationality;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", gender=" + gender
				+ ", age=" + age + ", nationality=" + nationality + "]";
	}
	public User(Integer id, String name, String mobile, String email, String gender, int age, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
	}
	
	
	User(){
		
	}
	
	
	
	

}
