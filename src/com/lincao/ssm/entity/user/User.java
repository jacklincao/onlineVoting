package com.lincao.ssm.entity.user;

import com.lincao.ssm.entity.baseEntity.Entity;

/**
* @ClassName: User
* @Description: TODO(用户实体)
* @author 曹林林
* @date 2017年9月4日 下午11:25:11
*
 */
public class User extends Entity{
	/**
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String password;
	
	private String tel;
	
	private String email;
	
	/*用户类型*/
	private String type;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", tel=" + tel + ", email=" + email + ", type=" + type
				+ "]";
	}
	
}
