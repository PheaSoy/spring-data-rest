package org.cfd.api.result;

import java.util.List;

import org.cfd.api.domain.User;

public class UserResult extends ReturnResult{
	
	private List<User> user;

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

}
