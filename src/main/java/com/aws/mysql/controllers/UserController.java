package com.aws.mysql.controllers;

import com.aws.mysql.api.UserApi;
import com.aws.mysql.domain.User;
import com.aws.mysql.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: UserController
 * Inside the package - com.aws.mysql.controllers
 * Created Date: 4/12/2020
 * Created Time: 6:01 PM
 **/
@RestController
public class UserController implements UserApi {

    @Autowired
    private IUserService userService;


    @Override
    public ResponseEntity<User> getUsers() {
        List<User> users = userService.findAllUsers();
        return new ResponseEntity(users, HttpStatus.OK);
    }
}
