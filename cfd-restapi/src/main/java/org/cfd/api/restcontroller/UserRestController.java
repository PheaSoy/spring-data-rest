package org.cfd.api.restcontroller;

import org.cfd.api.result.UserResult;
import org.cfd.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/all")
	private UserResult getUser() {
		UserResult result = new UserResult();
		result.setUser(userService.getUser());
		return result;

	}

}
