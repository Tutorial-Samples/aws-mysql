package com.aws.mysql.services;

import com.aws.mysql.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IUserService
 * Inside the package - com.aws.mysql.services
 * Created Date: 4/12/2020
 * Created Time: 6:05 PM
 **/
public interface IUserService {
    List<User> findAllUsers();
}
