package com.npst;

public class SupervisorContext {

	private String PrimaryPassword;
	private String UserId;

	public String getPrimaryPassword() {
		return PrimaryPassword;
	}

	public String getUserId() {
		return UserId;
	}
	public void setPrimaryPassword(String PrimaryPassword) {
		this.PrimaryPassword = PrimaryPassword;
	}
	public void setUserId(String UserId) {
		this.UserId = UserId;
	}
}
