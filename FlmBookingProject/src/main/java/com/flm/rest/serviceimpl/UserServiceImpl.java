package com.flm.rest.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.rest.dao.UserRepository;
import com.flm.rest.dto.UserDto;
import com.flm.rest.model.User;
import com.flm.rest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userrepository;

	@Override
	public void createUser(UserDto userdto) {
		User user = new User();
		BeanUtils.copyProperties(userdto, user);
		userrepository.save(user);

	}

	@Override
	public void updateUser(UserDto userdto) {
		User user = new User();
		user.setMobileNumber("9832827332");
		user.setPassword("ganesh88");
		BeanUtils.copyProperties(userdto, user);
		userrepository.save(user);

	}

}
