package org.cfd.api.service;

import java.util.ArrayList;
import java.util.List;

import org.cfd.api.domain.User;
import org.cfd.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUser() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().forEach(e->{
		list.add(e);
		});
		return list;
	}

}
