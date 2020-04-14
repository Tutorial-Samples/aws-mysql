package com.aws.mysql.api;

import com.aws.mysql.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: UserApi
 * Inside the package - com.aws.mysql.api
 * Created Date: 4/12/2020
 * Created Time: 6:06 PM
 **/

public interface UserApi {

    @GetMapping(value = "/users", produces = {"application/json"})
    ResponseEntity<User> getUsers();
}
