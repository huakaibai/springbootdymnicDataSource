package com.zhibinwang.service;

import com.zhibinwang.DataSource;
import com.zhibinwang.entity.UserEntity;
import com.zhibinwang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	@DataSource
	public List<UserEntity> findUser() {
		return userMapper.findUser();
	}

	@DataSource(value = "updateDataSource")
	public List<UserEntity> insertUser(String userName) {
		return userMapper.insertUser(userName);
	}

}
