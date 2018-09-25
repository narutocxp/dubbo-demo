package com.rongji.dubbo.service.impl;

import com.rongji.dto.UserDTO;
import com.rongji.dubbo.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public UserDTO getUser(Long id, String name) {
		UserDTO user=new UserDTO();
		user.setUserId(id);
		user.setUserName(name);
		return user;
	}

}
