package com.ailin.model;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * `user`.userid
	 * 
	 * @ibatorgenerated 2017-07-27 14:39:46
	 */
	private Integer userid;

	/**
	 * `user`.username
	 * 
	 * @ibatorgenerated 2017-07-27 14:39:46
	 */
	private String username;

	/**
	 * `user`.pass
	 * 
	 * @ibatorgenerated 2017-07-27 14:39:46
	 */
	private String pass;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", pass="
				+ pass + "]";
	}

}