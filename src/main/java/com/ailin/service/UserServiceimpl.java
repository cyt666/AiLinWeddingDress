package com.ailin.service;

import com.ailin.dao.UserDao;
import com.ailin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("userservice")
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userdao;


    public User login(User user) {

        User login = userdao.login(user);
        return login;
    }
}
