package com.ailin.dao;

import java.util.List;

import com.ailin.model.User;

public interface UserDao {

	int insertSelective(User record);

	int deleteById(Integer userid);

	int updateById(User record);

	List<User> selectAll();

	User login(User user);

	User selectByPrimaryKey(Integer userid);
}