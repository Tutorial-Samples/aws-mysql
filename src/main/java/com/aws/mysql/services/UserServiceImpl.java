package com.aws.mysql.services;

import com.aws.mysql.domain.User;
import com.aws.mysql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: UserServiceImpl
 * Inside the package - com.aws.mysql.services
 * Created Date: 4/12/2020
 * Created Time: 6:09 PM
 **/
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
